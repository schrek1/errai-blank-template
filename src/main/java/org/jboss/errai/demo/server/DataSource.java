package org.jboss.errai.demo.server;

import org.jboss.errai.demo.client.shared.UserAccount;

/**
 *
 * @author ondra
 */
public class DataSource{
   public VerifyResponse getUserByName(String userName){
    if(userName.equals("admin")){
      return new VerifyResponse(VerifyResponse.Status.ACCOUNT_FOUND, new UserAccount("admin", "1234"));
    }
    if(userName.equals("ondra")){
      return new VerifyResponse(VerifyResponse.Status.ACCOUNT_FOUND, new UserAccount("ondra", "4321"));
    }
    return new VerifyResponse(VerifyResponse.Status.UNKNOW_ACCOUNT, null);
  }
}
