package com.mycompany.proto.console.hello.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HelloServiceAsync {

	void sayHello(AsyncCallback callback);
}