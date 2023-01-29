package org.primefaces.showcase.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;

@Remote
public interface MaStockCAEFacadeLocal {
    public String test();
}