/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Remote;

/**
 *
 * @author Windows10
 */
@Remote
public interface MySessionBeanRemote {

    String getPrenom(String Nom);
    String doIt (String p);
    
}
