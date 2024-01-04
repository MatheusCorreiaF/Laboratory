package br.com.cod3r.factory.realfactory.apple.factory;

import br.com.cod3r.factory.realfactory.apple.model.IPhone;
import br.com.cod3r.factory.realfactory.apple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}
