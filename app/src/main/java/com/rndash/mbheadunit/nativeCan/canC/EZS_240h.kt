
package com.rndash.mbheadunit.nativeCan.canC

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for EZS_240h (ID 0x0240)
**/

object EZS_240h {

    	/** Gets Cruise control lever: "Switch off" **/
	fun get_off() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 7, 1) != 0
	
	/** Gets Cruise control lever: "Resume" **/
	fun get_wa() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 6, 1) != 0
	
	/** Gets Cruise control lever: "Set and accelerate level0" **/
	fun get_s_plus_b() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 5, 1) != 0
	
	/** Gets Cruise control lever: "Set and decelerate level0" **/
	fun get_s_minus_b() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 4, 1) != 0
	
	/** Gets Operation variable speed limit **/
	fun get_vmax_akt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 3, 1) != 0
	
	/** Gets Cruise control lever implausible **/
	fun get_wh_up() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 2, 1) != 0
	
	/** Gets Terminal 50 **/
	fun get_kl_50() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 15, 1) != 0
	
	/** Gets Terminal 15 **/
	fun get_kl_15() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 14, 1) != 0
	
	/** Gets brake switch for shift lock **/
	fun get_bs_sl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 13, 1) != 0
	
	/** Gets reverse gear engaged (only manual transmission) **/
	fun get_rg_schalt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 12, 1) != 0
	
	/** Gets left-hand drive / right-hand drive **/
	fun get_ll_rlc() : LL_RLC = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 10, 2)) {
		 0 -> LL_RLC.NOT_DEFINED
		 1 -> LL_RLC.LL
		 2 -> LL_RLC.RL
		 3 -> LL_RLC.SNV
		 else -> throw Exception("Invalid raw value for LL_RLC")
	}
	
	/** Gets Keyles Go event conditions met **/
	fun get_kg_alb_ok() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 9, 1) != 0
	
	/** Gets Keyless Go terminal control active **/
	fun get_kg_kl_akt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 8, 1) != 0
	
	/** Gets message counter **/
	fun get_bz240h() : Int = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 20, 4)
	
	/** Gets Cruise control lever parity (even parity) **/
	fun get_wh_pa() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 19, 1) != 0
	
	/** Gets crash signal from Airbag-SG **/
	fun get_crash() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 31, 1) != 0
	
	/** Gets CRASH confirmbit **/
	fun get_crash_cnf() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 30, 1) != 0
	
	/** Gets ASG sport mode on / off activated (ST2_LED_DL if ABC is available) **/
	fun get_asg_sport_bet() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 27, 1) != 0
	
	/** Gets direction flashing left **/
	fun get_bli_li() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 39, 1) != 0
	
	/** Gets direction flashing right **/
	fun get_bli_re() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 38, 1) != 0
	
	/** Gets wiper outside of parking position **/
	fun get_kl_31b() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 36, 1) != 0
	
	/** Gets handbrake applied (control lamp) **/
	fun get_has_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 35, 1) != 0
	
	/** Gets ESP on / off actuated **/
	fun get_esp_bet() : ESP_BET = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 33, 2)) {
		 0 -> ESP_BET.NBET
		 1 -> ESP_BET.AUS_BET
		 2 -> ESP_BET.EIN_NDEF
		 3 -> ESP_BET.SNV
		 else -> throw Exception("Invalid raw value for ESP_BET")
	}
	
	/** Gets On-board network emergency operation: Prio1 and Prio2 consumers off, second battery supports **/
	fun get_bn_ntlf() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 32, 1) != 0
	
	/** Gets Terminal 54 hardware active **/
	fun get_kl54_rm() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 47, 1) != 0
	
	/** Gets Switch on low beam **/
	fun get_abl_ein() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 46, 1) != 0
	
	/** Gets ART distance warning on / off activated **/
	fun get_art_abw_bet() : ART_ABW_BET = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 44, 2)) {
		 0 -> ART_ABW_BET.NDEF_NBET
		 1 -> ART_ABW_BET.AUS_NDEF
		 2 -> ART_ABW_BET.ON_BET
		 3 -> ART_ABW_BET.SNV
		 else -> throw Exception("Invalid raw value for ART_ABW_BET")
	}
	
	/** Gets LF / ABC 3-stage switch actuated **/
	fun get_st3_bet() : ST3_BET = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 42, 2)) {
		 0 -> ST3_BET.NBET
		 1 -> ST3_BET.UNBET_NDEF
		 2 -> ST3_BET.OBBET_BET
		 3 -> ST3_BET.NOT_DEFINED_ROCKER_AND_PUSH_PUSH
		 else -> throw Exception("Invalid raw value for ST3_BET")
	}
	
	/** Gets LF / ABC 2-stage switch actuated **/
	fun get_st2_bet() : ST2_BET = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 40, 2)) {
		 0 -> ST2_BET.NBET
		 1 -> ST2_BET.UNBET_NDEF
		 2 -> ST2_BET.OBBET_BET
		 3 -> ST2_BET.NOT_DEFINED_ROCKER_AND_PUSH_PUSH
		 else -> throw Exception("Invalid raw value for ST2_BET")
	}
	
	/** Gets distance factor **/
	fun get_art_abstand() : Int = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 48, 8)
	
	/** Gets country code **/
	fun get_ldc() : LDC = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 62, 2)) {
		 0 -> LDC.RDW
		 1 -> LDC.USA_CAN
		 2 -> LDC.NOT_DEFINED
		 3 -> LDC.SNV
		 else -> throw Exception("Invalid raw value for LDC")
	}
	
	/** Gets model-dependent vehicle version (only 220/215/230) **/
	fun get_fzgversn() : FZGVERSN = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 59, 3)) {
		 0 -> FZGVERSN.START_was_launched
		 1 -> FZGVERSN.V1
		 2 -> FZGVERSN.V2
		 3 -> FZGVERSN.V3
		 4 -> FZGVERSN.V4
		 5 -> FZGVERSN.V5
		 6 -> FZGVERSN.V6
		 7 -> FZGVERSN.V7
		 else -> throw Exception("Invalid raw value for FZGVERSN")
	}
	
	/** Gets E-suction fan: basic ventilation off **/
	fun get_gbl_aus() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 57, 1) != 0
	
	/** Gets ART available **/
	fun get_art_vh() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 56, 1) != 0
	
	
}