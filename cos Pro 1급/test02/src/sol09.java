

class sol09 {
	public boolean solution(String password) {
        int length = password.length();
        for(int i = 0; i < length - 2; ++i){
            int firstCheck = password.charAt(i + 1) - password.charAt(i);
            int secondCheck = password.charAt(i + 2) - password.charAt(i+1);
            if(firstCheck == secondCheck && (firstCheck == 1 || firstCheck == -1))
                return false;
        }
        return true;
    }
}
