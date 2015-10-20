package com.javatpoint.controller;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.javatpoint.form.Contact;
@Controller
@SessionAttributes
public class ContactController {
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public ModelAndView addContact(@ModelAttribute("contact")	Contact contact, BindingResult result) {
		//write the code here to add contact
		String message = "Hello ,This is the error page";
		return new ModelAndView("error", "message", message);
	}
	
	@RequestMapping("/contact")
	public ModelAndView showContacts() {
		return new ModelAndView("contact", "command", new Contact());
	}
}
