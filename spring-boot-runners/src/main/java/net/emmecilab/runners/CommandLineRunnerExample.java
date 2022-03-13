package net.emmecilab.runners;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;


@Component
public class CommandLineRunnerExample implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner - arguments passed:");
        Arrays.stream(args).forEach(System.out::println);
    }
}
