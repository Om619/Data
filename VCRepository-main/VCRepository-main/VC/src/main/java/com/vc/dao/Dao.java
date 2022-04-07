package com.vc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vc.models.MF_Fund_categories;
import com.vc.models.MF_Fund_holdings_debtstated_latest;
import com.vc.models.MF_Fund_holdings_rating;
import com.vc.models.MF_Fund_load_cdsc_latest;
import com.vc.models.MF_Fund_load_latest;
import com.vc.models.MF_Fund_manager_latest;
import com.vc.models.MF_Fund_plans;
import com.vc.models.MF_Fund_status;
import com.vc.models.MF_Holdings_detailed;
import com.vc.models.MF_Industry;

@Repository
public interface Dao extends JpaRepository<MF_Fund_plans,Long> {

}
