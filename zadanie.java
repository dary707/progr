class Music {
	public void performer() {
		System.out.println("У автора есть жанр");
	}
}

class LSP extends Music {
	public void performer() {
		System.out.println("Performer LSP");
	}
}

class BTS extends Music {
	public void performer() {
		System.out.println("Performer Lady Gaga");
	}
}

class Genre{
	public static void main(String[] args){
		Music author = new Music();
		Music LSP = new LSP();
		Music BTS = new BTS();
	       
		author = LSP;

		author.performer();
		author = BTS;

		author.performer();
	}
}
			
