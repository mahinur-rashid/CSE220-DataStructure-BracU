public class WRM {
    Patient dh;

    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public  void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient n = new Patient(id, name, age, bloodgroup, null, null);
        Patient tail = this.dh.next;
        while(tail.next != this.dh){
            tail = tail.next;
        }
        tail.next  = n;
        n.prev = tail;
        this.dh.prev = n;
        n.next = this.dh;
    }

    public void servePatient() {
        if(this.dh.next != null){   
            Patient a = this.dh.next;
            System.out.println(a.name + " is served");
            Patient b = a.next;
            this.dh.next = b;
            b.prev = this.dh;
        }
        else{
            System.out.println("No Patient in line");
        }

    }

    public void showAllPatient() {
        if(this.dh.next != null){
            Patient temp = this.dh.next ;

            int c = 1;
            while(temp != this.dh){
                System.out.print( c+"."+temp.name + " \n");
                temp = temp.next;
                c++;
            }
        }else{
            System.out.println("No Patient at this moment.");
        }
            
    }

    public boolean canDoctorGoHome() {
        if(this.dh.next == this.dh){
            return true;
        }
        return false; 
    }

    public void cancelAll() {
        this.dh.next = this.dh;
        this.dh.prev = this.dh;
        System.out.println("All appointments cancelled");
    }


    public void reverseTheLine() {
        if (this.dh.next == this.dh) {
            System.out.println("No Patient available");
        }
        else{
            if (this.dh == null || this.dh.next == this.dh) {
                return;
            }

            Patient current = this.dh;
            Patient temp = null;

            do {
                temp = current.next;
                current.next = current.prev;
                current.prev = temp;
                current = current.prev;
            } while (current != this.dh);
        
            if(temp != null){
                this.dh = temp.prev;
            }
            System.out.println("Line reversed");
        }
    }


}
