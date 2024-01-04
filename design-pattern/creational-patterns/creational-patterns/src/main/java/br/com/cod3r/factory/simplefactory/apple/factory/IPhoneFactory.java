package br.com.cod3r.factory.simplefactory.apple.factory;

import br.com.cod3r.factory.qweewqhalffactory.apple.model.*;
import br.com.cod3r.factory.realfactory.apple.model.*;
import br.com.cod3r.factory.simpleactory.apple.model.*;
import br.com.cod3r.factory.simplefactory.apple.model.IPhoneXSMax;

public class IPhoneFactory {

    public br.com.cod3r.factory.simplefactory.apple.model.IPhone orderIPhone(String type, String level){

        br.com.cod3r.factory.simplefactory.apple.model.IPhone iPhone = null;

        if(type.equals("11"))
            if (level.equalsIgnoreCase("E"))
                iPhone = new br.com.cod3r.factory.simplefactory.apple.model.IPhone11Pro();
            else
                iPhone = new br.com.cod3r.factory.simplefactory.apple.model.IPhone11();
        else if(type.equals("X"))
            if (level.equalsIgnoreCase("E"))
                iPhone = new br.com.cod3r.factory.simplefactory.apple.model.IPhoneX();
            else
                iPhone = new IPhoneXSMax();

        assert iPhone != null;
        iPhone.getHardware();
        iPhone.assemble();
        iPhone.certificates();
        iPhone.pack();

        return iPhone;
    }

}