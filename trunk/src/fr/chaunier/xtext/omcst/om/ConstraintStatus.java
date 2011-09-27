package fr.chaunier.xtext.omcst.om;

public enum ConstraintStatus {

	//Override
	WITHOUT,  
	IN_DATATYPE,  
    IN_FEATURE,  
    OVERRIDE,
    OVERRIDE_SAME_TYPE,
    OVERRIDE_ERROR_TYPE,
    OVERRIDE_SAME_CONSTRAINT,
    OVERRIDE_COMPATIBLE_CONSTRAINT,
    OVERRIDE_UNCOMPATIBLE_CONSTRAINT
    ;  

/*    
    private final int status;  

    ConstraintStatus(int aStatus){  
        this.status = aStatus;  
    }  
    public int status(){  
        return this.status;  
    }  
*/
}

/*
   public enum Status{  
        STATUS_OPEN(0, "open"),  
        STATUS_STARTED(1, "started"),  
        STATUS_INPROGRESS(2, "inprogress"),  
        STATUS_ONHOLD(3, "onhold"),  
        STATUS_COMPLETED(4, "completed"),  
        STATUS_CLOSED(5, "closed");  
  
        private final int status;  
        private final String description;  
  
        Status(int aStatus, String desc){  
            this.status = aStatus;  
            this.description = desc;  
        }  
        public int status(){  
            return this.status;  
        }  
        public String description(){  
            return this.description;  
        }  
    }     
   */