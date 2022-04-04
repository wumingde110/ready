package lamdaone;

public class Zhu {
    static class LikeStatic implements Like {
        @Override
        public void ha() {
            System.out.println("three");
        }
    }

    public static void main(String[] args) {
//        Like like=new LikeImpl();
//        like.ha();


//        Like like = new Like() {
//            @Override
//            public void ha() {
//                System.out.println("two");
//            }
//        };
//        like.ha();


//        Like like=new LikeStatic();
//        like.ha();

//        //局部内部类
//        class LikeIn implements Like {
//            @Override
//            public void ha() {
//                System.out.println("four");
//            }
//        }
//        Like like = new LikeIn();
//        like.ha();

        Like like=()->{
            System.out.println("five");
        };
        like.ha();

    }
}
