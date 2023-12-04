package br.unicap.eng2.atividade00.card;

    
    public abstract class Card {
        public abstract String getName(); 
    
        public abstract String getDescription(); 
    
        public abstract int getNumber();  
    
        public abstract Object getType(); 
    
        public abstract String getShape(); 
    
        public abstract String getObjective(); 

        public abstract void addCardsPorContinent(Card card);

        public static int add(int totalTerritorios) {
            return 0;
        }

        

        
    }

