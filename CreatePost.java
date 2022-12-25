public class CreatePost extends State{


        public CreatePost(Post post) {
            super(post);
        }

        @Override
        public void MakePost() {
            System.out.println("Самолет вышел из гаража");
            post.setState(new Moderation(post));
        }

        @Override
        public void ModeratePost() {
            System.out.println("Самолет уже в гараже");
        }

        @Override
        public void ReadyToPublic() {
            System.out.println("Пост еще не придумат=н, чтобы его публиковать");
        }


        @Override
        public void doAction() {
            System.out.println("Пост на этапе создания");
        }

}
