package page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Dashboardpage extends Base {

	public void user_click_on_available_data() {
		WebElement avail = driver.findElement(By.xpath("(//a[2])[1]"));
		mousehower(avail);
		ExecutorClick(avail);
	}

	public void available_data_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_remaining_hour() {
		WebElement rem = driver.findElement(By.xpath("(//a[3])[1]"));
		mousehower(rem);
		ExecutorClick(rem);
	}

	public void remaining_hour_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//li[@class='breadcrumb-item active']")).isDisplayed());
	}

	public void user_click_on_work_per_hour() {
		WebElement work = driver.findElement(By.xpath("(//a[4])[1]"));
		mousehower(work);
		ExecutorClick(work);
	}

	public void work_per_hour_page_should_open() {
		assertTrue(driver.findElement(By.xpath("(//label[@class='form-check-label'])[2]")).isDisplayed());
	}

	public void user_click_on_role_stat() {
		WebElement role = driver.findElement(By.xpath("(//a[5])[1]"));
		mousehower(role);
		ExecutorClick(role);
	}

	public void role_stat_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_specialist_work_stats_page() {
		WebElement spec = driver.findElement(By.xpath("(//a[6])[1]"));
		mousehower(spec);
		ExecutorClick(spec);
	}

	public void specialist_work_stats_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_specialist_work_logs() {
		WebElement log = driver.findElement(By.xpath("(//a[7])[1]"));
		mousehower(log);
		ExecutorClick(log);
	}

	public void specialist_work_logs_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_manager_work_stats() {
		WebElement mng = driver.findElement(By.xpath("(//a[8])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void manager_work_stats_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_manager_work_logs() {
		WebElement mng = driver.findElement(By.xpath("(//a[9])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void manager_work_logs_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_admin_work_stats() {
		WebElement mng = driver.findElement(By.xpath("(//a[10])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void admin_work_stats_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_admin_work_logs() {
		WebElement mng = driver.findElement(By.xpath("(//a[11])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void admin_work_logs_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_operations_requirement() {
		WebElement mng = driver.findElement(By.xpath("(//a[12])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void operations_requirement_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_insurance_work_stats() {
		WebElement mng = driver.findElement(By.xpath("(//a[13])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void insurance_work_stats_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_driver_work_stats() {
		WebElement mng = driver.findElement(By.xpath("(//a[14])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void driver_work_stats_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_user_work() {
		WebElement mng = driver.findElement(By.xpath("(//a[15])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void user_work_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_screen_sharing_logs() {
		WebElement mng = driver.findElement(By.xpath("(//a[16])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void screen_sharing_logs_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_workflow_work_stats() {
		WebElement mng = driver.findElement(By.xpath("(//a[17])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void workflow_work_stats_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_data_records_annotations() {
		WebElement mng = driver.findElement(By.xpath("(//a[18])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void data_records_annotations_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_inaccessible_data_records() {
		WebElement mng = driver.findElement(By.xpath("(//a[19])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void inaccessible_data_records_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_user_accuracy_charts() {
		WebElement mng = driver.findElement(By.xpath("(//a[20])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void user_accuracy_charts_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_sniffing_accuracy_charts() {
		WebElement mng = driver.findElement(By.xpath("(//a[21])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void sniffing_accuracy_charts_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_clubbed_by_user() {
		WebElement mng = driver.findElement(By.xpath("(//a[22])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void clubbed_by_user_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_all_payouts() {
		WebElement mng = driver.findElement(By.xpath("(//a[23])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void all_payouts_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_tds_report() {
		WebElement mng = driver.findElement(By.xpath("(//a[24])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void tds_report_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_update_payout_status() {
		WebElement mng = driver.findElement(By.xpath("(//a[25])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void update_payout_status_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_payout_accrual_logs() {
		WebElement mng = driver.findElement(By.xpath("(//a[26])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void payout_accrual_logs_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_hourly_rate_stats() {
		WebElement mng = driver.findElement(By.xpath("(//a[27])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void hourly_rate_stats_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_manager_wallet_logs() {
		WebElement mng = driver.findElement(By.xpath("(//a[28])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void manager_wallet_logs_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_bonus() {
		WebElement mng = driver.findElement(By.xpath("(//a[29])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void bonus_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_wallets() {
		WebElement mng = driver.findElement(By.xpath("(//a[30])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void wallets_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_workflows() {
		WebElement mng = driver.findElement(By.xpath("(//a[31])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void workflows_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	
	}

	public void user_click_on_wf_step() {
		WebElement mng = driver.findElement(By.xpath("(//a[32])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void wf_step_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_ai_throughputs() {
		WebElement mng = driver.findElement(By.xpath("(//a[33])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void ai_throughputs_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_manual_throughputs() {
		WebElement mng = driver.findElement(By.xpath("(//a[34])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void manual_throughputs_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_load_balancer() {
		WebElement mng = driver.findElement(By.xpath("(//a[35])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void load_balancer_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_records() {
		WebElement mng = driver.findElement(By.xpath("(//a[36])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void records_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_video_sources() {
		WebElement mng = driver.findElement(By.xpath("(//a[37])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void video_sources_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_users() {
		WebElement mng = driver.findElement(By.xpath("(//a[38])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void users_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_video_workflow_rules() {
		WebElement mng = driver.findElement(By.xpath("(//a[39])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void video_workflow_rules_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_object_workflow_rules() {
		WebElement mng = driver.findElement(By.xpath("(//a[40])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void object_workflow_rules_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_camera_ai_flows() {
		WebElement mng = driver.findElement(By.xpath("(//a[41])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void camera_ai_flows_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_camera_ai_models() {
		WebElement mng = driver.findElement(By.xpath("(//a[42])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void camera_ai_models_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_camera_ai_model_categories() {
		WebElement mng = driver.findElement(By.xpath("(//a[43])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void camera_ai_model_categories_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_events() {
		WebElement mng = driver.findElement(By.xpath("(//a[44])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void events_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_discard_events() {
		WebElement mng = driver.findElement(By.xpath("(//a[45])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void discard_events_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_add_bonus_type() {
		WebElement mng = driver.findElement(By.xpath("(//a[46])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void add_bonus_type_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_add_learning_video() {
		WebElement mng = driver.findElement(By.xpath("(//a[47])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void add_learning_video_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_city_permission() {
		WebElement mng = driver.findElement(By.xpath("(//a[48])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void city_permission_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_worker_supervisor_linking() {
		WebElement mng = driver.findElement(By.xpath("(//a[49])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void worker_supervisor_linking_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_overlays() {
		WebElement mng = driver.findElement(By.xpath("(//a[50])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void overlays_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_rtsp_link() {
		WebElement mng = driver.findElement(By.xpath("(//a[51])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void rtsp_link_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_user_details() {
		WebElement mng = driver.findElement(By.xpath("(//a[52])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void user_details_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_leaders_specialist() {
		WebElement mng = driver.findElement(By.xpath("(//a[53])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void leaders_specialist_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_role_requests() {
		WebElement mng = driver.findElement(By.xpath("(//a[54])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void role_requests_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_worker_groups() {
		WebElement mng = driver.findElement(By.xpath("(//a[55])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void worker_groups_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_work_time_restriction() {
		WebElement mng = driver.findElement(By.xpath("(//a[56])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void work_time_restriction_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_user_categories() {
		WebElement mng = driver.findElement(By.xpath("(//a[57])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void user_categories_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_surge_locations_map() {
		WebElement mng = driver.findElement(By.xpath("(//a[58])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void surge_locations_map_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_app_configs() {
		WebElement mng = driver.findElement(By.xpath("(//a[59])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void app_configs_map_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_data_transformations() {
		WebElement mng = driver.findElement(By.xpath("(//a[60])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void data_transformations_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_kafka_errors() {
		WebElement mng = driver.findElement(By.xpath("(//a[61])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void kafka_errors_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_work_assignment_tracker() {
		WebElement mng = driver.findElement(By.xpath("(//a[62])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void work_assignment_tracker_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_allowed_locations() {
		WebElement mng = driver.findElement(By.xpath("(//a[63])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void allowed_locations_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_application_modes() {
		WebElement mng = driver.findElement(By.xpath("(//a[64])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void application_modes_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_uac_system() {
		WebElement mng = driver.findElement(By.xpath("(//a[65])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void uac_system_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

	public void user_click_on_search_history() {
		WebElement mng = driver.findElement(By.xpath("(//a[66])[1]"));
		mousehower(mng);
		ExecutorClick(mng);
	}

	public void search_history_page_should_open() {
		assertTrue(driver.findElement(By.xpath("//h2[@class='col text-nowrap']")).isDisplayed());
	}

}
