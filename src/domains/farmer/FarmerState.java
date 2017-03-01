/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.farmer;

/**
 *
 * @author Tyler
 */
public class FarmerState {
    
    public FarmerState(Integer contents) {
            this.contents = contents;
        }
        
        private final int contents;
        private static final String NEW_LINE = "\n";
        
        public int getContents() {
        return contents;
    }
    
}
