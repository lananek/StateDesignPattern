public class CreatePost extends State{


        public CreatePost(Post post) {
            super(post);
        }

         @Override
        public void MakePost() {
            System.out.println("Пост придумывается");
            post.setState(new Moderation(post));
        }

        @Override
        public void ModeratePost() {
            System.out.println("Пост еще придумывается");
        }

        @Override
        public void ReadyToPublic() {
            System.out.println("Пост еще не придуман, чтобы его публиковать");
        }


        @Override
        public void doAction() {
            System.out.println("Пост на этапе создания");
        }

}
