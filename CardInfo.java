package DZ_4_OOP;

import java.sql.Date;

public class CardInfo<T> {
        private final T title;
        
       

        public CardInfo(T title) {
            this.title = title;
            
        }

        public T getTitle() {
            return title;
        }


        

        @Override
        public String toString() {
            return "CardInfo\n{" +
                    "title=" + title +
                    '}';
        }
    }

   

