public class PublicPost extends State {


        public PublicPost(Post post) {
            super(post);
        }

        @Override
        public void MakePost() {
            System.out.println("Ошибка. Пост опубликован");
        }

        @Override
        public void ModeratePost() {
            System.out.println("Ошибка. Пост опубликован");
        }

        @Override
        public void ReadyToPublic() {
            System.out.println("Пост уже опублткован");
        }


        @Override
        public void doAction() {
            System.out.println("Пост опубликован");
        }

}
