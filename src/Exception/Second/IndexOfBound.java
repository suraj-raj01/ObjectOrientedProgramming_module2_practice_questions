package Exception.Second;

class arrIndexOutOfBound {
        public static void main(String[] args){
            for(int i=0; i<args.length; i++){
                System.out.print(args[i+1]);
            }
        }
}
