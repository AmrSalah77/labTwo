public class Watch {
    String State = "Normal",State_Normal = "Time",State_Update = "min",State_Alarm = "Alarm";
    int m=0, h=0, D=1, M=1, Y=2000;
    public void watch(char input) {
        switch (State) {
            case "Normal" -> {
                if (input == 'a') {
                    if (State_Normal.equals("Time"))
                        State_Normal = "Date";
                    else
                        State_Normal = "Time";
                }
                if (input == 'b') State = "Alarm";
                if (input == 'c') State = "Update";
            }
            case "Update" -> {
                if (input == 'a') {
                    switch (State_Update) {
                        case "min" -> State_Update = "hour";
                        case "hour" -> State_Update = "day";
                        case "day" -> State_Update = "month";
                        case "month" -> State_Update = "year";
                        case "year" -> State = "Normal";
                    }
                }
                if (input == 'b') {
                    switch (State_Update) {
                        case "min":
                            if (m == 59) {
                                m = 0;
                            } else m++;
                            break;
                        case "hour":
                            if (h == 23) {
                                h = 0;
                            } else h++;
                            break;
                        case "day":
                            if (D == 31) {
                                D = 1;
                            } else D++;
                            break;
                        case "month":
                            if (M == 12) {
                                M = 1;
                            } else M++;
                            break;
                        case "year":
                            Y++;
                            break;
                    }
                }
                if (input == 'd') {
                    State = "Normal";
                }

            }
            case "Alarm" -> {
                if (input == 'a') State_Alarm = "Chime";
                if (input == 'd') State = "Normal";
            }
        }
    }
    public String displayDate(){
        return (Y+"-"+M+"-"+D);
    }
    public String displayTime(){

        return (h+":"+m);
    }
    public String displayState(){
        return State;
    }

}