package core;

public class Confirmation {
public static void conf() {
	Common com = new Common();
	com.openFireFox("http://alex.academy/exe/signup/v1/confirmation.php");
	String b[] = {"id_gender",
			"id_back_button",
			"id_f_title",
            "id_f_label_fn",
            "id_f_label_ln",
            "id_lname",
            "id_f_label_ea",
            "id_email",
            "id_f_label_pn",
            "id_phone",
            "id_rb_label_g",
            "id_f_label_s",
            "id_state",
            "id_cb_label_t",
            "copyright"};
	System.out.println("Checking if elements is Visable at"+"http://alex.academy/exe/signup/v1/confirmation.php");
	com.isVisable(b);
	System.out.println("Checking if elements is Present at"+"http://alex.academy/exe/signup/v1/confirmation.php");
	com.isPresent(b);
	
}
}
