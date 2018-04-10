# AbstractFactoryExample

Here comes a simple UI which is created by a UI factory. That UI factory implements AbstractUIFactory interface. 
Application uses that interface while implementation of that specified in SystemConfiguration.properties file.
This pattern allows to define implementation of whole the hierarchy of objects (here might be a lot of those)
in only just one line in the properties file or somewhere in your app's code and easily switch it over by necessity.
