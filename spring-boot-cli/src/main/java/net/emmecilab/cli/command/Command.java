package net.emmecilab.cli.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class Command {
	
	@ShellMethod(value="Hello World", key="hello-world")
	public String helloWorld () {
		return "Hello World!!";
	}
	
	@ShellMethod(value="Say hello")
	public String sayHello (@ShellOption(defaultValue="Carlo") String name) {
		return "Hello " + name;
	}

}
