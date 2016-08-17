create table if not exists arch_area (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     pinyin text null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     belong_shop_id integer not null
);
create table if not exists arch_bank_rate (
     bank_id integer not null,
     rate real not null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     primary key(bank_id,create_shop_id)
);
create table if not exists arch_bill_remark (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     pinyin text null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_cc_plan_shop (
     cc_plan_id integer not null,
     shop_id integer not null,
     primary key(cc_plan_id,shop_id)
);
create table if not exists arch_cc_plan_type (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     sort_order integer not null
);
create table if not exists arch_cc_plan (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     custom_type integer not null,
     pinyin text null,
     create_shop_id integer not null,
     delflg integer not null,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null,
     download_flg integer not null
);
create table if not exists arch_cc_type_item (
     cc_plan_id integer not null,
     custom_id integer not null,
     item_id integer not null,
     primary key(cc_plan_id,custom_id,item_id)
);
create table if not exists arch_cc_type (
     cc_plan_id integer not null,
     custom_id integer not null,
     code text not null,
     name text not null,
     belong_type integer not null,
     delflg integer not null default 0,
     primary key(cc_plan_id,custom_id)
);
create table if not exists arch_class_mt (
     small_class_id integer not null,
     im_class_id integer not null,
     primary key(small_class_id,im_class_id)
);
create table if not exists arch_item_class (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     pinyin text null,
     brand_id integer not null,
     pid integer not null default 0,
     leaf integer not null default 1,
     level integer not null default 0,
     is_limit_method integer null default 0,
     is_create_temp_item integer null default 0,
     is_item_can_dis integer null default 0,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_item_img (
     item_id integer primary key autoincrement,
     is_has_small_pic integer null default 0,
     is_has_big_pic1 integer null default 0,
     is_has_big_pic2 integer null default 0,
     is_has_big_pic3 integer null default 0,
     create_shop_id integer not null,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_item_im (
     item_id integer not null,
     method_id integer not null,
     primary key(item_id,method_id)
);
create table if not exists arch_item_label (
     item_id integer not null,
     label_id integer not null,
     primary key(item_id,label_id)
);
create table if not exists arch_item_method (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     pinyin text null,
     sort_order integer null,
     is_only_for_item integer null default 0,
     parent_id integer not null,
     is_need_fee integer null default 0,
     fee real not null default 0.0,
     is_rela_count integer null default 1,
     is_fee_editable integer null default 0,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_item_size (
     item_id integer not null,
     size_id integer not null,
     is_default integer not null,
     std_price real not null default 0,
     cost_price real not null default 0,
     delflg integer not null default 0,
     primary key(item_id,size_id)
);
create table if not exists arch_item_temp_his (
     id integer not null,
     name text not null,
     create_shop_id integer not null,
     std_price real not null default 0.0,
     unit_id integer null,
     add_times integer not null default 0,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     primary key(id,name,create_shop_id)
);
create table if not exists arch_item_temp (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     unit_id integer null,
     std_price real not null default 0.0,
     brand_id integer not null,
     big_class_id integer not null,
     small_class_id integer not null,
     is_enable integer not null default 1,
     pinyin text null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_item_unit (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     pinyin text null,
     is_assi_unit integer null default 0,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_item (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     unit_id integer not null,
     std_price real not null default 0.0,
     cost_price real not null default 0.0,
     assi_unit_id integer null,
     brand_id integer not null,
     big_class_id integer not null,
     small_class_id integer not null,
     is_package integer null default 0,
     pkg_type integer not null default 0,
     is_enable integer not null default 1,
     is_confirm_qty integer null default 0,
     is_calc_qty_by_price integer null default 0,
     is_can_discount integer null default 1,
     is_join_low_consume integer null default 1,
     min_add_qty real null default 0.0,
     max_add_qty real null default 0.0,
     is_temp_item integer null default 0,
     english_name text null,
     other_name text null,
     pinyin text null,
     barcode text null,
     item_labels text null,
     intro text null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     enable_muti_size integer not null default 0
);
create table if not exists arch_module_favor (
     emp_id integer not null,
     module_id integer not null,
     subsystem_id integer not null,
     primary key(emp_id,module_id)
);
create table if not exists arch_o2o_seller (
     o2o_id integer not null,
     payway_id integer not null,
     o2o_wuu_id integer not null,
     code text not null,
     name text not null,
     is_enable integer not null default 1,
     o2o_type integer not null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     primary key(o2o_id,payway_id)
);
create table if not exists arch_payway_detail (
     id integer primary key autoincrement,
     short_key text null,
     sort_order integer not null,
     payway_group_id integer null,
     is_enable integer not null default 1,
     create_shop_id integer not null,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_payway_shop_limit (
     payway_id integer not null,
     shop_id integer not null,
     primary key(payway_id,shop_id)
);
create table if not exists arch_payway_shop (
     shop_id integer not null,
     payway_id integer not null,
     primary key(shop_id,payway_id)
);
create table if not exists arch_payway (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     short_key text null,
     sort_order integer not null,
     need_ext_info integer null default 0,
     is_shop_limit integer not null default 0,
     is_use_alone integer not null default 0,
     is_time_limit integer not null default 0,
     limit_begin_time integer null,
     limit_end_time integer null,
     discount_rate real null default 1,--TODO
     ticket_value real not null default 0.0,
     income_money real not null default 0.0,
     payway_type_id integer not null,
     payway_group_id integer null,
     is_system integer not null default 0,
     is_hidden integer not null default 0,
     belong_payway_id integer null,
     is_enable integer not null default 1,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_pkg_limit_dt (
     pkg_id integer not null,
     item_type integer not null default 0,
     limit_id integer not null,
     primary key(pkg_id,limit_id,item_type)
);
create table if not exists arch_pkg_limit_type (
     pkg_id integer not null,
     limit_type integer not null default 0,
     primary key(pkg_id)
);
create table if not exists arch_pkg_normal_cls (
     pkg_id integer not null,
     pkg_class_id integer not null,
     choice_qty real not null default 0.0,
     choice_mix_qty real not null default 0.0,
     choice_min_qty real not null default 0.0,
     primary key(pkg_id,pkg_class_id)
);
create table if not exists arch_pkg_normal (
     pkg_id integer not null,
     item_id integer not null,
     default_qty real not null default 0.0,
     raise_price real not null default 0.0,
     is_raise_by_qty integer null default 1,
     pkg_class_id integer not null,
     is_required integer null default 0,
     is_qty_limited integer null default 0,
     ilimited_qty real not null default 0.0,
     limited_qty real not null default 0.0,
     item_size_id integer not null default -1,
     primary key(pkg_id,item_id)
);
create table if not exists arch_pkg_part (
     pkg_id integer not null,
     item_id integer not null,
     default_qty real not null default 0.0,
     primary key(pkg_id,item_id)
);
create table if not exists arch_point_label_detail (
     point_id integer not null,
     label_id integer not null,
     primary key(point_id,label_id)
);
create table if not exists arch_point (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     display_name text(70) not null,
     pinyin text null,
     area_id integer not null,
     type_id integer not null,
     def_capacity integer not null default 0,
     min_capacity integer null default 0,
     max_capacity integer null default 0,
     point_labels text null,
     is_enable integer not null default 1,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     belong_shop_id integer null
);
create table if not exists arch_pos (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     pinyin text null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     belong_shop_id int not null
);
create table if not exists arch_pushmoney_item (
     plan_id integer not null,
     item_id integer not null,
     condition real not null default 0.0,
     standard real not null default 0.0,
     item_size_id integer not null default -1,
     primary key(plan_id,item_id)
);
create table if not exists arch_pushmoney_plan_emp_shop (
     plan_id integer not null,
     emp_id integer not null,
     shop_id integer not null,
     primary key(plan_id,emp_id,shop_id)
);
create table if not exists arch_pushmoney_plan_shop (
     pushmoney_plan_id integer not null,
     shop_id integer not null,
     primary key(pushmoney_plan_id,shop_id)
);
create table if not exists arch_pushmoney_plan (
     id integer primary key autoincrement,
     name text not null,
     code text not null,
     allowanceType integer not null,
     includePkg integer not null,
     remark text null,
     is_enable integer not null default 1,
     delflg integer not null default 0,
     create_shop_id integer not null,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_pushmoney_table_detail (
     item_id integer not null,
     emp_id integer not null,
     table_id integer not null,
     plan_id integer not null,
     condition real not null default 0.0,
     standard real not null default 0.0,
     last_qty real not null default 0.0,
     orig_subtotal real not null default 0.0,
     last_subtotal real not null default 0.0,
     push_money real not null default 0.0
);
create table if not exists arch_pushmoney_table (
     id integer primary key autoincrement,
     name text not null,
     plan_id integer not null,
     begin_time integer not null,
     end_time integer not null,
     allowanceType integer not null,
     includePkg integer not null,
     create_shop_id integer not null,
     create_time integer not null,
     creator_id integer not null,
     delflg integer not null default 0,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_reason_type (
     reason_type_id integer not null,
     reason_type_code text not null,
     reason_type_name text not null,
     sort_order integer not null,
     primary key(reason_type_id)
);
create table if not exists arch_reason (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     is_break integer not null default 0,
     pinyin text null,
     is_sellout integer not null default 0,
     group_id integer not null,--TODO delete or not
     type_id integer not null,
     is_enable integer not null default 1,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_sale_type (
     id integer primary key autoincrement,
     name text not null
);
create table if not exists arch_serve_way (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     pinyin text null,
     is_system integer not null default 0,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_shift (
     id integer primary key autoincrement,
     name text not null,
     start_time integer null,
     default_start_time integer not null,
     create_shop_id integer not null,
     is_start_shift integer not null default 0,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists arch_unpaid_person (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     company_name text null,
     pinyin text null,
     unpaid_sum real not null default 0.0,
     remaining_sum real not null default 0.0,
     contact_person text null,
     contact_tel text null,
     address text null,
     remark text null,
     is_enable integer not null default 0,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists auth_access_group_emp (
     access_group_id integer not null,
     emp_id integer not null,
     primary key(access_group_id,emp_id)
);
create table if not exists auth_access_group_shop (
     access_group_id integer not null,
     shop_id integer not null,
     primary key(access_group_id,shop_id)
);
create table if not exists auth_access_group (
     id integer primary key autoincrement,
     name text not null,
     delflg integer not null default 0,
     create_shop_id integer not null,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null
);
create table if not exists auth_duty_module_oper (
     duty_id integer null,
     module_id integer not null,
     oper_id integer not null,
     auth_set_id integer not null
);
create table if not exists auth_module_favor (
     emp_id integer not null,
     module_id integer not null,
     subsystem_id integer not null,
     primary key(emp_id,module_id)
);
create table if not exists auth_module_oper (
     module_id integer not null,
     oper_id integer not null,
     primary key(module_id,oper_id)
);
create table if not exists auth_module (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     product_code text not null,
     pid integer not null default 0,
     url text null,
     use_in_single_shop integer not null default 0,
     chain_type integer not null default 0,
     is_hide_module integer null default 0,
     leaf integer not null default 1,
     level integer null,
     sort_order integer null,
     is_enable integer not null default 1,
     describe text null,
     module_icon text null,
     is_export integer not null default 0
);
create table if not exists auth_oper (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     product_code text not null,
     url text null,
     sort_order integer null,
     is_enable integer not null default 1
);
create table if not exists auth_product (
     code text not null,
     name text not null,
     version text not null,
     primary key(code)
);
create table if not exists auth_set_shop (
     auth_set_id integer not null,
     shop_id integer not null,
     primary key(auth_set_id,shop_id)
);
create table if not exists auth_set (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     describe text null,
     useflg integer not null default 1,
     delflg integer not null default 0,
     is_enable integer not null default 1,
     create_shop_id integer not null,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists bm_discount_plan_shop (
     discount_plan_id integer not null,
     shop_id integer not null,
     primary key(discount_plan_id,shop_id)
);
create table if not exists bm_discount_plan (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     setting_mode integer null default 0,
     is_enable integer not null default 1,
     describe text null,
     is_imp_activity integer not null default 0,
     is_day_limit integer not null default 0,
     begin_day integer null,
     end_day integer null,
     is_shift_limit integer not null default 0,
     is_week_limit integer not null default 0,
     is_shop_limit integer not null default 0,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists bm_dp_detail (
     dp_id integer not null,
     detail_id integer not null,
     dis_type integer not null default 1,
     dis_price real not null default 0.0,
     dis_scale real not null default 1,
     primary key(dp_id,detail_id,dis_type)
);
create table if not exists bm_dp_shift (
     dp_id integer not null,
     shift_id integer not null,
     primary key(dp_id,shift_id)
);
create table if not exists bm_dp_week (
     dp_id integer not null,
     week integer not null,
     primary key(dp_id,week)
);
create table if not exists bm_ic_limit (
     item_id integer primary key autoincrement,
     type integer not null default 1,
     is_auto_restore integer not null default 1,
     sales_quantity real not null default 0.0,
     limit_quantity real not null default 99,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists bm_ic_sellout (
     item_id integer primary key autoincrement,
     type integer not null default 1,
     is_auto_restore integer not null default 1,
     create_shop_id integer not null,
     delflg integer null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists bm_low_consume_item (
     item_id integer not null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     primary key(item_id,create_shop_id)
);
create table if not exists bm_op_set_detail (
     op_set_id integer not null,
     duty_id integer not null,
     key integer not null,
     type integer not null,
     value text null,
     primary key(duty_id,op_set_id,key)
);
create table if not exists bm_op_set_discplan (
     op_set_id integer not null,
     duty_id integer not null,
     disc_plan_id integer not null,
     primary key(op_set_id,duty_id,disc_plan_id)
);
create table if not exists bm_op_set_item (
     op_set_id integer not null,
     duty_id integer not null,
     op_item_type integer not null,
     item_type integer not null,
     item_id integer not null,
     primary key(op_set_id,duty_id,op_item_type,item_id)
);
create table if not exists bm_op_set_shop (
     op_set_id integer not null,
     shop_id integer not null,
     primary key(op_set_id,shop_id)
);
create table if not exists bm_op_set (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     describe text null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     is_enable integer not null default 1
);
create table if not exists bm_pl_detail (
     pl_id integer not null,
     item_id integer not null,
     price real not null default 0.0,
     item_size_id integer not null default -1,
     primary key(pl_id,item_id)
);
create table if not exists bm_pl_shift (
     pl_id integer not null,
     shift_id integer not null,
     primary key(pl_id,shift_id)
);
create table if not exists bm_pl_week (
     pl_id integer not null,
     week integer not null,
     primary key(pl_id,week)
);
create table if not exists bm_point_mng_detail (
     point_mng_id integer not null,
     ponit_id integer not null,
     shop_id integer not null,
     primary key(point_mng_id,ponit_id)
);
create table if not exists bm_point_mng_item (
     point_mng_id integer not null,
     item_id integer not null,
     item_service_type integer not null default 0,
     item_qty real not null default 1,
     primary key(point_mng_id,item_id)
);
create table if not exists bm_point_mng_shop (
     point_mng_id integer not null,
     shop_id integer not null,
     primary key(point_mng_id,shop_id)
);
create table if not exists bm_point_mng (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     minimum_charge_type integer not null default 0,
     minimum_charge real not null default 0.0,
     service_charge_type integer not null default 0,
     service_charge real not null default 0.0,
     service_charge_toplimit real not null default 0.0,
     free_service_charge real not null default 0.0,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists bm_pos_has_area (
     pos_id integer not null,
     area_id integer not null,
     create_shop_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     primary key(area_id,pos_id)
);
create table if not exists bm_pos_print (
     pos_id integer not null,
     style_type integer not null,
     is_enable integer not null default 1,
     printer text null,
     print_times integer not null default 1,
     style_id integer not null,
     create_shop_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     qrcode_type int2 default 0,
     primary key(pos_id,style_type)
);
create table if not exists bm_pos_set (
     pos_id integer not null,
     pos_set_id text(4) not null,
     pos_set_type integer not null,
     pos_set_value text null,
     create_shop_id integer not null,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     primary key(pos_id,pos_set_id)
);
create table if not exists bm_pri_local_shop (
     pri_local_id integer not null,
     shop_id integer not null,
     primary key(pri_local_id,shop_id)
);
create table if not exists bm_pri_local (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     is_enable integer not null default 1,
     describe text null,
     sort_order integer not null,
     is_week_limit integer not null default 0,
     is_shift_limit integer not null default 0,
     is_pos_limit integer not null default 0,
     is_area_limit integer not null default 0,
     is_day_limit integer not null default 0,
     begin_day integer null,
     end_day integer null,
     sale_type_id integer null default 1,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists bm_promote_detail (
     promote_id integer not null,
     item_id integer not null,
     price real not null default 0.0,
     primary key(promote_id,item_id)
);
create table if not exists bm_promote_shift (
     promote_id integer not null,
     shift_id integer not null,
     primary key(promote_id,shift_id)
);
create table if not exists bm_promote_shop (
     promote_id integer not null,
     shop_id integer not null,
     primary key(promote_id,shop_id)
);
create table if not exists bm_promote_week (
     promote_id integer not null,
     week integer not null,
     primary key(promote_id,week)
);
create table if not exists bm_promote (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     is_enable integer not null default 1,
     describe text null,
     sort_order integer not null,
     is_week_limit integer not null default 0,
     is_shift_limit integer not null default 0,
     is_day_limit integer not null default 0,
     begin_day integer null,
     end_day integer null,
     sale_type_id integer null default 1,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists bm_service_class_limit (
     item_class_id integer not null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     primary key(item_class_id,create_shop_id)
);
create table if not exists bm_unpaid_bill (
     id integer primary key autoincrement,
     pw_detail_id integer null,
     payway_id integer null,
     ts_id integer null,
     bs_id integer null,
     settle_state integer null,
     unpaid_person_id integer not null,
     type_id integer not null,
     code text not null,
     unpaid_money real not null default 0.0,
     paid_money real not null default 0.0,
     discount_money real not null default 0.0,
     remain_money real not null default 0.0,
     is_repay integer not null default 0,
     remark text null,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     delflg integer not null default 0
);
create table if not exists o2o_wuu_config (
     id integer not null,
     is_enable integer,
     url text,
     username text,
     password text,
     timeout integer,
     modify_time integer not null,
     modifier_id integer not null,
     delflg integer not null default 0,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     create_shop_id integer not null,
     belong_shop_id integer not null,
     primary key(id)
);
create table if not exists sys_code_rule (
     rule_name text not null,
     table_name text not null,
     code_column text not null default 'code',
     condition_column text null,
     default_len integer not null,
     pre_code_table_name text null,
     pre_code_table_id_column text null default 'id',
     pre_code_table_code_column text null default 'code',
     primary key(rule_name)
);
create table if not exists sys_del_bs_data_config (
     shop_id integer primary key autoincrement,
     scale real not null,
     is_enable integer not null,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     trigger_name text null,
     trigger_hour text(2) null,
     trigger_minute text(2) null
);
create table if not exists sys_del_bs_data_shop (
     center_shop_id integer not null,
     shop_id integer not null,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     primary key(center_shop_id,shop_id)
);
create table if not exists sys_del_bs_data (
     shop_id integer not null,
     bs_id integer not null,
     bs_code text not null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     date_time text not null default '',
     primary key(shop_id,bs_id)
);
create table if not exists sys_del_table (
     tb_phy_name text not null,
     business_type integer not null,
     tb_normal_name text null,
     schema_type integer not null,
     sort_order integer not null,
     del_type integer not null,
     del_where_dt integer null,
     primary key(tb_phy_name,business_type)
);
create table if not exists sys_log_bak (
     id integer primary key autoincrement,
     produce_code text not null,
     module_id integer not null,
     oper_id integer null,
     log_content text not null,
     log_type integer not null,
     creator_id integer not null,
     creator_time integer not null,
     oper_ip text not null,
     pos_id integer null,
     point_id integer null,
     bs_id integer null,
     relation_id integer null,
     log_bak_time integer not null,
     create_shop_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists sys_log (
     id integer primary key autoincrement,
     produce_code text not null,
     module_id integer not null,
     oper_id integer null,
     log_content text not null,
     log_type integer not null,
     creator_id integer not null,
     creator_time integer not null,
     oper_ip text not null,
     pos_id integer null,
     point_id integer null,
     bs_id integer null,
     relation_id integer null,
     create_shop_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists sys_mobi_user (
     emp_id integer not null,
     create_shop_id integer not null,
     create_time integer not null,
     creator_id integer not null
);
create table if not exists sys_param_list (
     type integer not null,
     key integer not null,
     value text not null,
     sort_order integer not null,
     primary key(type,key)
);
create table if not exists sys_param (
     key integer primary key autoincrement,
     value text not null,
     describe text null
);
create table if not exists sys_patch_data_status (
     status_key integer primary key autoincrement,
     create_time integer not null,
     remark text null
);
create table if not exists sys_reserve_group_detail (
     reserve_id integer null,
     detail_id integer null,
     name text null,
     delflg integer null,
     sort_order integer null
);
create table if not exists sys_reserve_group (
     reserve_id integer null,
     type integer null,
     name text null,
     delflg integer null,
     sort_order integer null
);
create table if not exists sys_setting (
     create_shop_id integer not null,
     key integer not null,
     type integer null,
     value text null,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     primary key(key,create_shop_id)
);
create table if not exists sys_table_key (
     table_name text not null,
     column_name text not null,
     center_id integer not null,
     cur_value integer not null,
     primary key(table_name,column_name,center_id)
);
create table if not exists dbi_city (
     id integer primary key autoincrement,
     name text null,
     pinyin text null,
     province_id integer null,
     sort_order integer null
);
create table if not exists dbi_county (
     id integer primary key autoincrement,
     name text null,
     pinyin text null,
     city_id integer null,
     sort_order integer null
);
create table if not exists dbi_dept (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     pinyin text null,
     is_product_dept integer not null default 0,
     use_type integer not null default 0,
     pid integer not null default 0,
     leaf integer not null default 0,
     level integer not null default 0,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     create_shop_id  int not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists dbi_duty_type (
     id integer primary key autoincrement,
     code text not null,
     name text not null
);
create table if not exists dbi_duty (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     type_id integer not null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists dbi_emp_state (
     emp_id integer primary key autoincrement,
     last_login_sys integer null,
     last_login_time integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists dbi_emp (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     pinyin text null,
     password text null,
     is_admin integer not null default 0,
     is_group_emp integer not null default 0,
     dept_id integer not null,
     belong_shop_id integer not null,
     duty_id integer not null,
     address text null,
     cellphone text null,
     birthday integer null,
     id_card text null,
     email text null,
     married integer not null default 0,
     sex integer not null default 0,
     is_enable integer not null default 1,
     auth_card text null,
     auth_code text null,
     create_shop_id integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists dbi_exp_template (
     id integer primary key autoincrement,
     name text not null,
     create_time integer null,
     type_id integer not null,
     flag integer not null,
     file_name text not null,
     creator_id integer not null,
     delflg integer not null,
     create_shop_id integer null
);
create table if not exists dbi_product (
     code text not null,
     name text not null,
     version text not null,
     primary key(code)
);
create table if not exists dbi_province_type (
     id integer primary key autoincrement,
     name text null
);
create table if not exists dbi_province (
     id integer primary key autoincrement,
     name text null,
     pinyin text null,
     type_id integer null,
     region_id integer null,
     sort_order integer null
);
create table if not exists dbi_pub_code_type (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     sort_order integer not null,
     pid integer not null default 0,
     leaf integer not null default 1,
     level integer not null default 0,
     is_hide integer not null default 0
);
create table if not exists dbi_pub_code (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     pinyin text null,
     type_id integer not null,
     create_shop_id integer not null,
     is_system integer not null default 0,
     sort_order integer not null,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1
);
create table if not exists dbi_region (
     id integer primary key autoincrement,
     name text null
);
create table if not exists dbi_shop (
     id integer primary key autoincrement,
     code text not null,
     name text not null,
     pinyin text null,
     manage_type_id integer not null,
     brand_id integer not null,
     is_enable integer not null default 1,
     region_id integer not null,
     province_id integer not null,
     city_id integer not null,
     county_id integer null,
     address text null,
     dog_number text null,
     contact_tel text null,
     order_tel text null,
     fax text null,
     server_ip text null,
     is_open integer not null default 0,
     open_time integer null,
     area integer null,
     capacity integer null,
     gc_x real null,
     gc_y real null,
     remark text null,
     is_center integer not null default 0,
     is_local integer not null default 0,
     delflg integer not null default 0,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     slogan text null,
     contact_person text null,
     center_id integer null,
     create_shop_id integer null
);
create table if not exists o2o_crm_config (
     id integer not null,
     is_enable integer,
     url text,
     username text,
     password text,
     timeout integer,
     discount_plan_id integer,
     modify_time integer,
     modifier_id integer,
     delflg integer not null default 0,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     create_shop_id integer not null,
     belong_shop_id integer not null,
     query_url text,
     primary key(id)
);
create table if not exists o2o_crm_config_pos (
     id integer not null,
     pos_id integer,
     crm_pos_id text,
     device_id text,
     wuu_crm_config_id integer not null,
     primary key(id)
);
create table if not exists wuu_item_upload_type (
     id integer not null,
     name text not null,
     code text not null,
     delflg integer not null,
     set_id integer,
     create_shop_id integer,
     primary key(id)
);
create table if not exists wuu_item_upload_set (
     id integer not null,
     code text not null,
     name text not null,
     describe text,
     delflg integer not null,
     is_enable integer not null default 1,
     create_shop_id integer not null,
     create_time integer not null,
     creator_id integer not null,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer,
     download_flg integer,
     pl_id integer,
     dp_id integer,
     primary key(id)
);
create table if not exists biz_code_rule (
     rule_id integer not null,
     create_shop_id integer not null,
     is_use_prefix integer default 1,
     prefix text,
     is_use_shop_code integer default 1,
     is_use_date integer default true,
     date_format text,
     is_reset_by_day integer default 1,
     modify_time integer not null,
     modifier_id integer not null,
     upload_flg integer not null default 1,
     download_flg integer not null default 1,
     primary key(rule_id,create_shop_id)
);
create table if not exists wuu_mo_set (
     id integer not null,
     code text,
     name text,
     describe text,
     delflg integer,
     is_enable integer,
     create_shop_id integer,
     create_time integer,
     creator_id integer,
     modify_time integer,
     modifier_id integer,
     upload_flg integer,
     download_flg integer,
     primary key(id)
);
create table if not exists wuu_mo_group (
     id integer not null,
     code text,
     name text,
     set_id integer,
     delflg integer,
     select_model integer default 1,
     primary key(id)
);