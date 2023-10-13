using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddDbContext<ApplicationDbContext>();

var app = builder.Build();

app.MapGet("/", () => "Hello World2!");

app.MapPost("/", () => new { metodo = "post", prop2 = "prop2", });

app.MapPost("/product", (IConfiguration config, Product product, HttpResponse response) => {    
    ProductRepository.add(product);
    Console.WriteLine($"»»»»{config["Logging"]}");
    return Results.Created($"/product/{product.Code}", product);
});

app.MapPut("/product", (Product product, HttpResponse response) => {    
    
    try{
        ProductRepository.getProduct(product.Code).Name = product.Name;
        return Results.Ok();
    } catch {
        return Results.NotFound();
    }

    
});


app.MapGet("/product/{code}", ([FromRoute] string code) => {    
    
    var findedProduct = ProductRepository.getProduct(code);
    return (findedProduct != null) ? Results.Ok(findedProduct) : Results.NotFound(); 
});

app.MapDelete("/product/{code}", ([FromRoute] string code) => {        
    
    return Results.Ok(ProductRepository.Products.Remove(ProductRepository.getProduct(code)));
});


app.MapGet("/queryParam",([FromQuery] string dateInit, [FromQuery] string dateEnd) => {

    return dateInit + "»»" + dateEnd;
});

app.MapGet("/pathParam/{pathparam1}",([FromRoute] string pathparam1) => {

    return "»»" + pathparam1;
});

app.MapGet("/paramHeader", (HttpRequest request) => {

    var varHeader = request.Headers["testeHeader"];
    return $"From header: »» {varHeader}";
 });

app.Run();

public static class ProductRepository {
    
    public static List<Product> Products{ get; set; }// = new List<Product>();

    public static void add(Product product) {
        
        if(Products == null) {
            Products = new List<Product>();
        }

        Products.Add(product);
    }

    public static Product getProduct(string code) {

        try {
        return (Products.First(p => p.Code == code));
        } catch {
            return null;
        }
    }
}

public class Product {
    public int Id { get; set; }
    public string Name { get; set;}
    public string Code { get; set;}

    public string Description { get; set; }
}

public class ObjetoTeste {
    public int Id { get; set; }
    public string Name { get; set;}
    public string Code { get; set;}
}


public class ApplicationDbContext : DbContext{
    
    public DbSet<Product> ProductsColumn {get; set;}
    public DbSet<ObjetoTeste> ObjetoTesteColumn {get; set;}

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder) 
        => optionsBuilder.UseSqlServer("Server=localhost;Database=ProductsDB;User Id=sa;Password=Teste123!;MultipleActiveResultSets=true;Encrypt=YES;TrustServerCertificate=YES");

    

}