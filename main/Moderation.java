public class Moderation extends State{

        public Moderation(Post post) {
            super(post);
        }

        @Override
        public void MakePost() {
            System.out.println("Пост уже придуман");
        }

        @Override
        public void ModeratePost() {
            System.out.println("Пост на модерации");
            post.setState(new PublicPost(post));
        }

        @Override
        public void ReadyToPublic() {
            System.out.println("Пост готов к публикации");
            post.setState(new PublicPost(post));
        }


        @Override
        public void doAction() {
            System.out.println("Пост на модерации");
        }

}
