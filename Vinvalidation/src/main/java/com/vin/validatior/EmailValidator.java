package com.vin.validatior;

import java.util.regex.Pattern;

public class EmailValidator implements Validator<String>{

	public boolean isValid(String type) {

		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (type == null)
			return false;
		return pat.matcher(type).matches();
	}

}
