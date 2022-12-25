public class Post {

        private State state;

        public Post() {
            state = new PublicPost(this);
        }


        public void MakePost() {
            state.MakePost();
        }


        public void ModeratePost() {
            state.ModeratePost();
        }


        public void ReadyToPublic() {
            state.ReadyToPublic();
        }


        public void doAction() {
            state.doAction();
        }


        public State getState() {
            return state;
        }


        public void setState(State state) {
            this.state = state;
        }
}
