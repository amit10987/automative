package com.mediadigital.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mediadigital.constant.VehicleConstant;
import com.mediadigital.model.FourWheeler;
import com.mediadigital.service.VehicleService;

/**
 * @author amit
 *
 */
@Controller
public class VehicleController {

	private static final Logger LOGGER = Logger.getLogger(VehicleController.class);

	@Autowired
	VehicleService vehicleService;

	/**
	 * @return
	 * @throws IOException
	 */
	@GetMapping("/")
	public String getAutomativeHomePage(Model model) {
		model.addAttribute("cars", vehicleService.findAll());
		return VehicleConstant.VEHICLE_MANAGER;
	}

	@PostMapping("/addCar")
	public String addCar(Model model, HttpServletRequest request) {
		FourWheeler vehicle = new FourWheeler();
		vehicle.setId(request.getParameter("car.id").equals("") ? null : request.getParameter("car.id"));
		vehicle.setBrand(request.getParameter("car.brand"));
		vehicle.setModel(request.getParameter("car.model"));
		vehicleService.saveVehicle(vehicle);
		return "redirect:/";
	}

	@PostMapping("/deleteCar")
	public String deleteCar(Model model, HttpServletRequest request) {
		FourWheeler vehicle = new FourWheeler();
		vehicle.setId(request.getParameter("car.id"));
		vehicleService.deleteCar(vehicle);
		return VehicleConstant.VEHICLE_MANAGER;
	}

	@GetMapping("/login")
	public String login() {
		return "/login";
	}

	@GetMapping("/403")
	public String error403() {
		return "/error/403";
	}
}