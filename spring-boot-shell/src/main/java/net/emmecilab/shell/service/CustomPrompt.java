package net.emmecilab.shell.service;


import org.jline.utils.AttributedString;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Service;

@Service
public class CustomPrompt implements PromptProvider{

	@Override
	public AttributedString getPrompt() {
		return new AttributedString("emmecilab:>");
	}

}
