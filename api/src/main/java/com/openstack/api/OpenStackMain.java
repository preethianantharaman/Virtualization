package com.openstack.api;

import org.openstack4j.api.OSClient;
import org.openstack4j.core.transport.Config;
import org.openstack4j.openstack.OSFactory;

public class OpenStackMain {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		System.out.println("Openstack Starts");
		Keystone openstone = new Keystone();
		openstone.ListTenant();
		
	}

}
