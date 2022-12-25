public abstract class State {

        protected Post post;

        public State(Post post) {
            this.post = post;
        }

        public abstract void MakePost();
        public abstract void ModeratePost();
        public abstract void ReadyToPublic();

        public abstract void doAction();

}
