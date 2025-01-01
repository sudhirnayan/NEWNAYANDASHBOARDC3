package stepdefinition;

import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Dashboardpage;

public class dashbaordstep extends Base {
	WebDriver driver;
	Dashboardpage dash = new Dashboardpage();

	@When("user click on available data")
	public void user_click_on_available_data() {
		dash.user_click_on_available_data();
	}

	@Then("available data page should open")
	public void available_data_page_should_open() {
		dash.available_data_page_should_open();
	}

	@When("user click on remaining hour")
	public void user_click_on_remaining_hour() {
		dash.user_click_on_remaining_hour();
	}

	@Then("remaining hour page should open")
	public void remaining_hour_page_should_open() {
		dash.remaining_hour_page_should_open();
	}

	@When("user click on work per hour")
	public void user_click_on_work_per_hour() {
		dash.user_click_on_work_per_hour();
	}

	@Then("work per hour page should open")
	public void work_per_hour_page_should_open() {
		dash.work_per_hour_page_should_open();
	}

	@When("user click on role stat")
	public void user_click_on_role_stat() {
		dash.user_click_on_role_stat();
	}

	@Then("role stat page should open")
	public void role_stat_page_should_open() {
		dash.role_stat_page_should_open();
	}

	@When("user click on Specialist Work Stats page")
	public void user_click_on_specialist_work_stats_page() {
		dash.user_click_on_specialist_work_stats_page();
	}

	@Then("Specialist Work Stats page should open")
	public void specialist_work_stats_page_should_open() {
		dash.specialist_work_stats_page_should_open();
	}

	@When("user click on Specialist Work Logs")
	public void user_click_on_specialist_work_logs() {
		dash.user_click_on_specialist_work_logs();
	}

	@Then("Specialist Work Logs page should open")
	public void specialist_work_logs_page_should_open() {
		dash.specialist_work_logs_page_should_open();
	}

	@When("user click on Manager Work Stats")
	public void user_click_on_manager_work_stats() {
		dash.user_click_on_manager_work_stats();
	}

	@Then("Manager Work Stats page should open")
	public void manager_work_stats_page_should_open() {
		dash.manager_work_stats_page_should_open();
	}

	@When("user click on Manager Work Logs")
	public void user_click_on_manager_work_logs() {
		dash.user_click_on_manager_work_logs();
	}

	@Then("Manager Work Logs page should open")
	public void manager_work_logs_page_should_open() {
		dash.manager_work_logs_page_should_open();
	}

	@When("user click on Admin Work Stats")
	public void user_click_on_admin_work_stats() {
		dash.user_click_on_admin_work_stats();
	}

	@Then("Admin Work Stats page should open")
	public void admin_work_stats_page_should_open() {
		dash.admin_work_stats_page_should_open();
	}

	@When("user click on Admin Work Logs")
	public void user_click_on_admin_work_logs() {
		dash.user_click_on_admin_work_logs();
	}

	@Then("Admin Work Logs page should open")
	public void admin_work_logs_page_should_open() {
		dash.admin_work_logs_page_should_open();
		}

	@When("user click on Operations Requirement")
	public void user_click_on_operations_requirement() {
		dash.user_click_on_operations_requirement();
	}

	@Then("Operations Requirement page should open")
	public void operations_requirement_page_should_open() {
		dash.operations_requirement_page_should_open();
	}

	@When("user click on Insurance Work Stats")
	public void user_click_on_insurance_work_stats() {
		dash.user_click_on_insurance_work_stats();
	}

	@Then("Insurance Work Stats page should open")
	public void insurance_work_stats_page_should_open() {
		dash.insurance_work_stats_page_should_open();
	}

	@When("user click on Driver Work Stats")
	public void user_click_on_driver_work_stats() {
		dash.user_click_on_driver_work_stats();
	}

	@Then("Driver Work Stats page should open")
	public void driver_work_stats_page_should_open() {
		dash.driver_work_stats_page_should_open();
	}

	@When("user click on User Work")
	public void user_click_on_user_work() {
		dash.user_click_on_user_work();
	}

	@Then("User Work page should open")
	public void user_work_page_should_open() {
		dash.user_work_page_should_open();
	}

	@When("user click on Screen sharing logs")
	public void user_click_on_screen_sharing_logs() {
		dash.user_click_on_screen_sharing_logs();
	}

	@Then("Screen sharing logs page should open")
	public void screen_sharing_logs_page_should_open() {
		dash.screen_sharing_logs_page_should_open();
	}

	@When("user click on Workflow Work Stats")
	public void user_click_on_workflow_work_stats() {
		dash.user_click_on_workflow_work_stats();
	}

	@Then("Workflow Work Stats page should open")
	public void workflow_work_stats_page_should_open() {
		dash.workflow_work_stats_page_should_open();
	}

	@When("user click on Data Records Annotations")
	public void user_click_on_data_records_annotations() {
		dash.user_click_on_data_records_annotations();
	}

	@Then("Data Records Annotations page should open")
	public void data_records_annotations_page_should_open() {
		dash.data_records_annotations_page_should_open();
	}

	@When("user click on Inaccessible Data Records")
	public void user_click_on_inaccessible_data_records() {
		dash.user_click_on_inaccessible_data_records();
	}

	@Then("Inaccessible Data Records page should open")
	public void inaccessible_data_records_page_should_open() {
		dash.inaccessible_data_records_page_should_open();
	}

	@When("user click on User Accuracy Charts")
	public void user_click_on_user_accuracy_charts() {
		dash.user_click_on_user_accuracy_charts();
	}

	@Then("User Accuracy Charts page should open")
	public void user_accuracy_charts_page_should_open() {
		dash.user_accuracy_charts_page_should_open();
	}

	@When("user click on Sniffing Accuracy Charts")
	public void user_click_on_sniffing_accuracy_charts() {
		dash.user_click_on_sniffing_accuracy_charts();
	}

	@Then("Sniffing Accuracy Charts page should open")
	public void sniffing_accuracy_charts_page_should_open() {
		dash.sniffing_accuracy_charts_page_should_open();
	}

	@When("user click on Clubbed by User")
	public void user_click_on_clubbed_by_user() {
		dash.user_click_on_clubbed_by_user();
	}

	@Then("Clubbed by User page should open")
	public void clubbed_by_user_page_should_open() {
		dash.clubbed_by_user_page_should_open();
	}

	@When("user click on All Payouts")
	public void user_click_on_all_payouts() {
		dash.user_click_on_all_payouts();
	}

	@Then("All Payouts page should open")
	public void all_payouts_page_should_open() {
		dash.all_payouts_page_should_open();
	}

	@When("user click on TDS Report")
	public void user_click_on_tds_report() {
		dash.user_click_on_tds_report();
	}

	@Then("TDS Report page should open")
	public void tds_report_page_should_open() {
		dash.tds_report_page_should_open();
	}

	@When("user click on Update Payout Status")
	public void user_click_on_update_payout_status() {
		dash.user_click_on_update_payout_status();
	}

	@Then("Update Payout Status page should open")
	public void update_payout_status_page_should_open() {
		dash.update_payout_status_page_should_open();
	}

	@When("user click on Payout Accrual Logs")
	public void user_click_on_payout_accrual_logs() {
		dash.user_click_on_payout_accrual_logs();
	}

	@Then("Payout Accrual Logs page should open")
	public void payout_accrual_logs_page_should_open() {
		dash.payout_accrual_logs_page_should_open();
	}

	@When("user click on Hourly Rate Stats")
	public void user_click_on_hourly_rate_stats() {
		dash.user_click_on_hourly_rate_stats();
	}

	@Then("Hourly Rate Stats page should open")
	public void hourly_rate_stats_page_should_open() {
		dash.hourly_rate_stats_page_should_open();
	}

	@When("user click on Manager Wallet Logs")
	public void user_click_on_manager_wallet_logs() {
		dash.user_click_on_manager_wallet_logs();
	}

	@Then("Manager Wallet Logs page should open")
	public void manager_wallet_logs_page_should_open() {
		dash.manager_wallet_logs_page_should_open();
	}

	@When("user click on Bonus")
	public void user_click_on_bonus() {
		dash.user_click_on_bonus();
	}

	@Then("Bonus page should open")
	public void bonus_page_should_open() {
		dash.bonus_page_should_open();
	}

	@When("user click on Wallets")
	public void user_click_on_wallets() {
		dash.user_click_on_wallets();
	}

	@Then("Wallets page should open")
	public void wallets_page_should_open() {
		dash.wallets_page_should_open();
	}

	@When("user click on Workflows")
	public void user_click_on_workflows() {
		dash.user_click_on_workflows();
	}

	@Then("Workflows page should open")
	public void workflows_page_should_open() {
		dash.workflows_page_should_open();
	}

	@When("user click on Wf Step")
	public void user_click_on_wf_step() {
		dash.user_click_on_wf_step();
	}

	@Then("Wf Step page should open")
	public void wf_step_page_should_open() {
		dash.wf_step_page_should_open();
	}

	@When("user click on AI Throughputs")
	public void user_click_on_ai_throughputs() {
		dash.user_click_on_ai_throughputs();
	}

	@Then("AI Throughputs page should open")
	public void ai_throughputs_page_should_open() {
		dash.ai_throughputs_page_should_open();
	}

	@When("user click on Manual Throughputs")
	public void user_click_on_manual_throughputs() {
		dash.user_click_on_manual_throughputs();
	}

	@Then("Manual Throughputs page should open")
	public void manual_throughputs_page_should_open() {
		dash.manual_throughputs_page_should_open();
	}

	@When("user click on Load Balancer")
	public void user_click_on_load_balancer() {
		dash.user_click_on_load_balancer();
	}

	@Then("Load Balancer page should open")
	public void load_balancer_page_should_open() {
		dash.load_balancer_page_should_open();
	}

	@When("user click on Records")
	public void user_click_on_records() {
		dash.user_click_on_records();
	}

	@Then("Records page should open")
	public void records_page_should_open() {
		dash.records_page_should_open();
	}

	@When("user click on Video Sources")
	public void user_click_on_video_sources() {
		dash.user_click_on_video_sources();
	}

	@Then("Video Sources page should open")
	public void video_sources_page_should_open() {
		dash.video_sources_page_should_open();
	}

	@When("user click on Users")
	public void user_click_on_users() {
		dash.user_click_on_users();
	}

	@Then("Users page should open")
	public void users_page_should_open() {
		dash.users_page_should_open();
	}

	@When("user click on Video Workflow Rules")
	public void user_click_on_video_workflow_rules() {
		dash.user_click_on_video_workflow_rules();
	}

	@Then("Video Workflow Rules page should open")
	public void video_workflow_rules_page_should_open() {
		dash.video_workflow_rules_page_should_open();
	}

	@When("user click on Object Workflow Rules")
	public void user_click_on_object_workflow_rules() {
		dash.user_click_on_object_workflow_rules();
	}

	@Then("Object Workflow Rules page should open")
	public void object_workflow_rules_page_should_open() {
		dash.object_workflow_rules_page_should_open();
	}

	@When("user click on Camera AI Flows")
	public void user_click_on_camera_ai_flows() {
		dash.user_click_on_camera_ai_flows();
	}

	@Then("Camera AI Flows page should open")
	public void camera_ai_flows_page_should_open() {
		dash.camera_ai_flows_page_should_open();
	}

	@When("user click on Camera AI Models")
	public void user_click_on_camera_ai_models() {
		dash.user_click_on_camera_ai_models();
	}

	@Then("Camera AI Models page should open")
	public void camera_ai_models_page_should_open() {
		dash.camera_ai_model_categories_page_should_open();
	}

	@When("user click on Camera AI Model Categories")
	public void user_click_on_camera_ai_model_categories() {
		dash.user_click_on_camera_ai_model_categories();
	}

	@Then("Camera AI Model Categories page should open")
	public void camera_ai_model_categories_page_should_open() {
		dash.camera_ai_model_categories_page_should_open();
	}

	@When("user click on Events")
	public void user_click_on_events() {
		dash.user_click_on_events();
	}

	@Then("Events page should open")
	public void events_page_should_open() {
		dash.events_page_should_open();
	}

	@When("user click on Discard Events")
	public void user_click_on_discard_events() {
		dash.user_click_on_discard_events();
	}

	@Then("Discard Events page should open")
	public void discard_events_page_should_open() {
		dash.discard_events_page_should_open();
	}

	@When("user click on Add Bonus Type")
	public void user_click_on_add_bonus_type() {
		dash.user_click_on_add_bonus_type();
	}

	@Then("Add Bonus Type page should open")
	public void add_bonus_type_page_should_open() {
		dash.add_bonus_type_page_should_open();
	}

	@When("user click on Add Learning Video")
	public void user_click_on_add_learning_video() {
		dash.user_click_on_add_learning_video();
	}

	@Then("Add Learning Video page should open")
	public void add_learning_video_page_should_open() {
		dash.add_learning_video_page_should_open();
	}

	@When("user click on City Permission")
	public void user_click_on_city_permission() {
		dash.user_click_on_city_permission();
	}

	@Then("City Permission page should open")
	public void city_permission_page_should_open() {
		dash.city_permission_page_should_open();
	}

	@When("user click on Worker Supervisor Linking")
	public void user_click_on_worker_supervisor_linking() {
		dash.user_click_on_worker_supervisor_linking();
	}

	@Then("Worker Supervisor Linking page should open")
	public void worker_supervisor_linking_page_should_open() {
		dash.worker_supervisor_linking_page_should_open();
	}

	@When("user click on Overlays")
	public void user_click_on_overlays() {
		dash.user_click_on_overlays();
	}

	@Then("Overlays page should open")
	public void overlays_page_should_open() {
		dash.overlays_page_should_open();
	}

	@When("user click on RTSP Link")
	public void user_click_on_rtsp_link() {
		dash.user_click_on_rtsp_link();
	}

	@Then("RTSP Link page should open")
	public void rtsp_link_page_should_open() {
		dash.rtsp_link_page_should_open();
	}

	@When("user click on User Details")
	public void user_click_on_user_details() {
		dash.user_click_on_user_details();
	}

	@Then("User Details page should open")
	public void user_details_page_should_open() {
		dash.user_details_page_should_open();
	}

	@When("user click on Leaders-Specialist")
	public void user_click_on_leaders_specialist() {
		dash.user_click_on_leaders_specialist();
	}

	@Then("Leaders-Specialist page should open")
	public void leaders_specialist_page_should_open() {
		dash.leaders_specialist_page_should_open();
	}

	@When("user click on Role Requests")
	public void user_click_on_role_requests() {
		dash.user_click_on_role_requests();
	}

	@Then("Role Requests page should open")
	public void role_requests_page_should_open() {
		dash.role_requests_page_should_open();
	}

	@When("user click on Worker Groups")
	public void user_click_on_worker_groups() {
		dash.user_click_on_worker_groups();
	}

	@Then("Worker Groups page should open")
	public void worker_groups_page_should_open() {
		dash.worker_groups_page_should_open();
	}

	@When("user click on Work Time Restriction")
	public void user_click_on_work_time_restriction() {
		dash.user_click_on_work_time_restriction();
	}

	@Then("Work Time Restriction page should open")
	public void work_time_restriction_page_should_open() {
		dash.work_time_restriction_page_should_open();
	}

	@When("user click on User Categories")
	public void user_click_on_user_categories() {
		dash.user_click_on_user_categories();
	}

	@Then("User Categories page should open")
	public void user_categories_page_should_open() {
		dash.user_categories_page_should_open();
	}

	@When("user click on Surge Locations Map")
	public void user_click_on_surge_locations_map() {
		dash.user_click_on_surge_locations_map();
	}

	@Then("Surge Locations Map page should open")
	public void surge_locations_map_page_should_open() {
		dash.surge_locations_map_page_should_open();
	}

	@When("user click on App Configs")
	public void user_click_on_app_configs() {
		dash.user_click_on_app_configs();
	}

	@Then("App Configs Map page should open")
	public void app_configs_map_page_should_open() {
		dash.app_configs_map_page_should_open();
	}

	@When("user click on Data Transformations")
	public void user_click_on_data_transformations() {
		dash.user_click_on_data_transformations();
	}

	@Then("Data Transformations page should open")
	public void data_transformations_page_should_open() {
		dash.data_transformations_page_should_open();
	}

	@When("user click on Kafka Errors")
	public void user_click_on_kafka_errors() {
		dash.user_click_on_kafka_errors();
	}

	@Then("Kafka Errors page should open")
	public void kafka_errors_page_should_open() {
		dash.kafka_errors_page_should_open();
	}

	@When("user click on Work Assignment Tracker")
	public void user_click_on_work_assignment_tracker() {
		dash.user_click_on_work_assignment_tracker();
	}

	@Then("Work Assignment Tracker page should open")
	public void work_assignment_tracker_page_should_open() {
		dash.work_assignment_tracker_page_should_open();
	}

	@When("user click on Allowed Locations")
	public void user_click_on_allowed_locations() {
		dash.user_click_on_allowed_locations();
	}

	@Then("Allowed Locations page should open")
	public void allowed_locations_page_should_open() {
		dash.allowed_locations_page_should_open();
	}

	@When("user click on Application Modes")
	public void user_click_on_application_modes() {
		dash.user_click_on_application_modes();
	}

	@Then("Application Modes page should open")
	public void application_modes_page_should_open() {
	dash.application_modes_page_should_open();
	}

	@When("user click on UAC System")
	public void user_click_on_uac_system() {
		dash.user_click_on_uac_system();
	}

	@Then("UAC System page should open")
	public void uac_system_page_should_open() {
		dash.uac_system_page_should_open();
	}

	@When("user click on Search History")
	public void user_click_on_search_history() {
		dash.user_click_on_search_history();
	}

	@Then("Search History page should open")
	public void search_history_page_should_open() {
		dash.search_history_page_should_open();
	}

}
