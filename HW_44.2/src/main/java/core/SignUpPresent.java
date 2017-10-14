package core;

public class SignUpPresent {
	//public static void main(String [] args) {
	public static void isPresent() {
		Common co = new Common();
		co.openFireFox("http://alex.academy/exe/signup/v1/index.php");
		String a []= {"id_quotes"
				,"id_current_location",
				"id_weather_icon",
				"id_temperature",
                 "id_rb_label_m"	,
                 "id_gender_male",
                 "id_rb_label_f",
                 "id_gender_female",
                 "id_img_facebook",
                 "id_img_twitter",
                 "id_img_flickr",
                 "id_img_youtube",
                 "id_reset_button",
                 "id_submit_button",
                 "timestamp",
                 "os_browser",
                 "ErrorLine",
                 "fname_error",
                 "lname_error",
                 "email_error",
                 "phone_error",
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
                 "copyright",};
		System.out.println("Checking if elements is Visable at"+"http://alex.academy/exe/signup/v1/index.php")
		
		;
		co.isVisable(a);
		System.out.println("Checking if elements is Present at"+"http://alex.academy/exe/signup/v1/index.php"
				);
		co.isPresent(a);
		
		
		
		
		
	}
	//public static void main (String [] args)

}
