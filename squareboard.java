public abstract class squareboard {
    int squareb;
    squareboard(int squareb){
        this.squareb = squareb;
    }
    public  abstract  boolean issquareoccupied();
    public abstract character getcharacter();

    public static final class emptysquare extends squareboard{
        emptysquare(int coordinate){
            super(coordinate);
        }

        @Override
        public boolean issquareoccupied() {
            return false;
        }

        @Override
        public character getcharacter() {
            return null;
        }
    }
    public static final class squareoccupied extends squareboard{
        character characteronsquare;
        squareoccupied(int squareb, character characteronsquare){
            super(squareb);
            this.characteronsquare = characteronsquare;
        }

        @Override
        public boolean issquareoccupied() {
            return true;
        }

        @Override
        public character getcharacter() {
            return this.characteronsquare;
        }
    }
}
