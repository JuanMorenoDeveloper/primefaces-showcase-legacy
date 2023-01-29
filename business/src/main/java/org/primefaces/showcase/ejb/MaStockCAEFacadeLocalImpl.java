package org.primefaces.showcase.ejb;

import javax.ejb.Stateless;

@Stateless(mappedName = "ejb/SitioWeb/MaStockCAEFacadeBean")
public class MaStockCAEFacadeLocalImpl implements MaStockCAEFacadeLocal {
    @Override
    public String test() {
        return "EJB";
    }
}
