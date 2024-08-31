package pl.enux.maventestproject;

import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/**
 * Simple class for tests.
 * @author Maciej Nux Jaros
 */
public class JupiterNb {
	private static final Pattern SPECIAL_CHAR_PATTERN = Pattern.compile("[^A-Za-z0-9]+");

	/** Static. */
	private JupiterNb() {
	}

	/**
	 * Modify path
	 *
	 * @param str url
	 * @param id object id
	 * @return cleaned up str.
	 */
	public static String preparePath(String str, Integer id) {
		if (str == null || str.isBlank()) {
			return "nn-%d".formatted(id);
		}
		var text = str;
		text = SPECIAL_CHAR_PATTERN.matcher(text).replaceAll("-");
		text = StringUtils.strip(text, "-").toLowerCase();
		return text + "-" + id;
	}
}
