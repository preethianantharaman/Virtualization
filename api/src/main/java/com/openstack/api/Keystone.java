package com.openstack.api;

import java.util.List;

import org.openstack4j.api.OSClient;
import org.openstack4j.core.transport.Config;
import org.openstack4j.model.identity.Tenant;
import org.openstack4j.openstack.OSFactory;

public class Keystone {
	public OSClient auth  =  null;
// Authenticate for accessing Keystone services	
	public Keystone(){
		System.out.println("Keystone Authentication");
		auth = OSFactory.builder()	
						.endpoint("http://127.0.0.1:5000/v2.0")
						.credentials("admin","7f7c19e177214f67")
						.tenantName("admin")
						.withConfig(Config.newConfig().withEndpointNATResolution("127.0.0.1")) 
						.authenticate();
		System.out.println("Authenticate OpenStack:" + auth);		
		}
// List all Tenants in Openstack
	public void ListTenant(){
		List<? extends Tenant> tenants = auth.identity().tenants().list();
			System.out.println("Tentant list: " + tenants);
	}
	
}
