package br.com.cod3r.factory.realfactory.apple.factory;

import br.com.cod3r.factory.realfactory.apple.model.IPhone;
public abstract class IPhoneFactory {

	public IPhone orderIPhone(){

        IPhone iPhone = null;

        iPhone = createIPhone();

        iPhone.assemble();
        iPhone.certificates();
        iPhone.pack();
        iPhone.getHardware();

        return iPhone;
    }

    protected abstract IPhone createIPhone();
}
