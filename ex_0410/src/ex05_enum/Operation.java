package ex05_enum;

public enum Operation {
	PLUS {
		@Override
		public int apply(int x, int y) {
			return x+y;
		}
	},
	MINUS {
		@Override
		public int apply(int x, int y) {
			return x-y;
		}
	},
	MULTIM {
		@Override
		public int apply(int x, int y) {
			return x*y;
		}
	},
	DIV {
		@Override
		public int apply(int x, int y) {
			return x/y;
		}
	};
	
	abstract public int apply(int x,int y);
	
}
