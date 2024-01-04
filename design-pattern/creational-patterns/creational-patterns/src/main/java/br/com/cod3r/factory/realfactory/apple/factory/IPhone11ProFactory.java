package br.com.cod3r.factory.realfactory.apple.factory;

import br.com.cod3r.factory.realfactory.apple.model.IPhone;
import br.com.cod3r.factory.realfactory.apple.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
