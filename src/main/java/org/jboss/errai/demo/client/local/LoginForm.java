/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.errai.demo.client.local;

import com.google.gwt.user.client.ui.Composite;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 *
 * @author ondra
 */

//toto je hlavni trida, kde se loguje do CRM
@EntryPoint
@Page(role = DefaultPage.class)
@Templated("LoginForm.html#formular")
public class LoginForm extends Composite{

}
