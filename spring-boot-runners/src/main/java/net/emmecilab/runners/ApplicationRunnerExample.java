package net.emmecilab.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerExample implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ApplicationRunner - arguments passed:");

		System.out.println("# NonOptionArgs: " + args.getNonOptionArgs().size());

		System.out.println("NonOptionArgs:");
		args.getNonOptionArgs().forEach(System.out::println);

		System.out.println("# OptionArgs: " + args.getOptionNames().size());
		System.out.println("OptionArgs: ");

		args.getOptionNames().forEach(optionName -> {
			System.out.println(optionName + " = " + args.getOptionValues(optionName));
		});
	}
}
