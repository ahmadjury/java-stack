public class StringManipulator {
	public String trimAndConcat(String a, String b){
		String result;
		result = a.trim() + b.trim();
		return result;
	}


	public Integer getIndexOrNull(String a,char b){
		Integer result;
		 result = a.indexOf(b);
		if (result<0){
			return null;
		}
		return result ;
	}

	public Integer getIndexOrNull(String a,String b){
		Integer result;
		result = a.indexOf(b);
		if (result<0){
			return null;
		}
		return result ; 
	}


	public String concatSubstring(String a, int b , int c, String d){
		String result;
		String result2;
		result = a.substring (b,c);
		result2 = result.concat(d);
		return result2;

	}
}


