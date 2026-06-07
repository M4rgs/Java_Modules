

public class UsersArryList implements UsersList{

    private User[] names = new User[10];

    @Override
    public void addUser(String name){
        for (int i = 0; i < this.names.length; i++){
            if (this.names[i] == null){
                this.names[i] = new User();
                this.names[i].setName(name);
                this.names[i].setId(i);
                break ;
            }
        }
    }

    @Override
    public void retrieveUserByIndex(Integer idx){
        int y = 0;
        if (this.names[idx] != null && this.names[idx].getId() != -1){

            User nameToRemove = this.names[idx];

            User[] tmpNames = new User[this.names.length - 1];
            

            for (int i = 0; i < this.names.length; i++){
                if (this.names[i] != null && !this.names[i].equals(nameToRemove)){

                    tmpNames[y] = this.names[i];
                    y++;
                }
            }

            this.names = tmpNames;
        }
        else
            throw new UserNotFoundException("No User Foubd !\n");

    }

    @Override
    public void retrieveUserById(Integer ID){
        Integer idx = 0;
        for (int i = 0; i < this.names.length; i++){
            if (this.names[i] != null && this.names[i].getId().equals(ID)){
                idx = i;
                break;
            }

        }
        if (idx == 0)
             throw new UserNotFoundException("No User Foubd !\n");

        this.retrieveUserByIndex(idx);
    }

    public void prinUsers(){
        for (int i = 0; i < this.names.length; i++){
            if (this.names[i] != null)
                System.out.format("ID: %d\tUsername: %s\n", this.names[i].getId(), this.names[i].getName());
        }
    }
}
