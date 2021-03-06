package avenuestack.impl.util;

public class TypeSafe {

	public static boolean isEmpty(String s) {
		return s == null || s.length() == 0;
	}
	
	public static boolean isTrue(String s) {
		String ls = s.toLowerCase();
		if (ls.equals("1") || ls.equals("y") || ls.equals("t") || ls.equals("yes") || ls.equals("true"))
			return true;
		else
			return false;
	}

	public static String anyToString(Object v) {
		if (v == null)
			return null;
		if (v instanceof String) {
			return (String) v;
		}
		return v.toString();
	}

	public static int anyToInt(Object v) {
		if (v == null)
			return 0;
		if (v instanceof Integer) {
			return (Integer) v;
		}
		if (v instanceof Number) {
			return ((Number) v).intValue();
		}
		try {
			return Integer.parseInt(v.toString());
		} catch (Exception e) {
			return 0;
		}
	}

	public static long anyToLong(Object v) {
		if (v == null)
			return 0;
		if (v instanceof Long) {
			return (Long) v;
		}
		if (v instanceof Number) {
			return ((Number) v).longValue();
		}
		try {
			return Long.parseLong(v.toString());
		} catch (Exception e) {
			return 0;
		}
	}

	public static double anyToDouble(Object v) {
		if (v == null)
			return 0;
		if (v instanceof Double) {
			return (Double) v;
		}
		if (v instanceof Number) {
			return ((Number) v).doubleValue();
		}
		try {
			return Double.parseDouble(v.toString());
		} catch (Exception e) {
			return 0;
		}
	}

}
