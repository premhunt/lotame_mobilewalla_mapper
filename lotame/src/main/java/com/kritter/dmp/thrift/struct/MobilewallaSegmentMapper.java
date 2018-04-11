package com.kritter.dmp.thrift.struct;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sam on 16/5/17.
 */
public enum MobilewallaSegmentMapper {
    id_gd_1318("13-18","id_gd_1318"),
    id_gd_1924("19-24","id_gd_1924"),
    id_gd_2534("25-34","id_gd_2534"),
    id_gd_3549("35-49","id_gd_3549"),
    id_te_3gde("3G Device Consumers","id_te_3gde"),
    id_te_4gde("4G Device Consumers","id_te_4gde"),
    id_re_asea("ASEAN Tourist Shoppers","id_re_asea"),
    id_tr_airt("Air Travelers","id_tr_airt"),
    id_pe_alte("Alternative Lifestyle","id_pe_alte"),
    id_au_aubu("Auto Buying Intenders","id_au_aubu"),
    id_gd_avin("Average Income","id_gd_avin"),
    id_re_barg("Bargain Shoppers","id_re_barg"),
    id_re_beau("Beauty, Health & Grocery Buyers","id_re_beau"),
    id_re_bibo("Big Box Retailer Shoppers","id_re_bibo"),
    id_re_book("Books & Audible Buyers","id_re_book"),
    id_tr_bume("Bus/Metro Users","id_tr_bume"),
    id_tr_busi("Business Travelers","id_tr_busi"),
    id_re_cpgb("CPG Buyers","id_re_cpgb"),
    id_ia_casi("Casino Frequenters","id_ia_casi"),
    id_rl_chri("Christian","id_rl_chri"),
    id_re_chri("Christmas shoppers","id_re_chri"),
    id_re_clsj("Clothing, Shoes & Jewelery Buyers","id_re_clsj"),
    id_ls_coll("College Students","id_ls_coll"),
    id_ed_coll("College Students","id_ed_coll"),
    id_se_comp("Computer Industry Professionals","id_se_comp"),
    id_re_cons("Consumer Electronics Buyers","id_re_cons"),
    id_ia_ccme("Country Club Members","id_ia_ccme"),
    id_sp_cric("Cricket Fans","id_sp_cric"),
    id_sp_cycl("Cycling","id_sp_cycl"),
    id_ia_danc("Dance Lovers","id_ia_danc"),
    id_re_dsvs("Department Store Value Shoppers","id_re_dsvs"),
    id_hf_diet("Dieters","id_hf_diet"),
    id_te_down("Downloaders","id_te_down"),
    id_te_dual("Dual Sim Phone Users","id_te_dual"),
    id_re_ecsh("E-comm Shoppers","id_re_ecsh"),
    id_hf_exer("Exercise Enthusiasts","id_hf_exer"),
    id_cg_fawk("Families with Kids","id_cg_fawk"),
    id_gd_fawk("Families with Kids","id_gd_fawk"),
    id_re_fasf("Fashion Followers","id_re_fasf"),
    id_gd_fema("Females","id_gd_fema"),
    id_se_fina("Finance Industry Professionals","id_se_fina"),
    id_fd_fooc("Foodies/Cooking Enthusiasts","id_fd_fooc"),
    id_hf_fooc("Foodies/Cooking Enthusiasts","id_hf_fooc"),
    id_ia_game("Gamers","id_ia_game"),
    id_en_gaad("Games - Adventure","id_en_gaad"),
    id_en_gaar("Games - Arcade","id_en_gaar"),
    id_en_gabo("Games - Board","id_en_gabo"),
    id_en_gacr("Games - Card","id_en_gacr"),
    id_en_gacs("Games - Casino","id_en_gacs"),
    id_en_gaca("Games - Casual","id_en_gaca"),
    id_en_gadi("Games - Dice","id_en_gadi"),
    id_en_gafa("Games - Family","id_en_gafa"),
    id_en_gamr("Games - Music & Rhythm","id_en_gamr"),
    id_en_gapu("Games - Puzzle","id_en_gapu"),
    id_en_garv("Games - Racing & Vehicle Simulators","id_en_garv"),
    id_en_gasf("Games - Shooters and fps","id_en_gasf"),
    id_en_gasi("Games - Simulation","id_en_gasi"),
    id_en_gasp("Games - Sports","id_en_gasp"),
    id_en_gast("Games - Strategy","id_en_gast"),
    id_en_gatr("Games - Trivia","id_en_gatr"),
    id_en_gawo("Games - Word","id_en_gawo"),
    id_sp_golf("Golf Fans","id_sp_golf"),
    id_hf_gymr("Gym Regulars","id_hf_gymr"),
    id_gd_hiin("High Income","id_gd_hiin"),
    id_ed_hiss("High School Students","id_ed_hiss"),
    id_te_hida("High data Users","id_te_hida"),
    id_rl_hind("Hindu","id_rl_hind"),
    id_re_holi("Holiday Shoppers","id_re_holi"),
    id_fd_chef("Home Chefs","id_fd_chef"),
    id_re_home("Home, Garden & Tools Buyers","id_re_home"),
    id_re_hots("Hotel Shoppers","id_re_hots"),
    id_re_inte("In market: Telco","id_re_inte"),
    id_re_mart("Indomart, Alfamarts and 7-evelen","id_re_mart"),
    id_re_jewe("Jewelry Shoppers","id_re_jewe"),
    id_ls_jose("Job Seekers","id_ls_jose"),
    id_tr_leis("Leisure Travellers","id_tr_leis"),
    id_gd_lowi("Low Income","id_gd_lowi"),
    id_gd_male("Males","id_gd_male"),
    id_cg_mife("Millennial Females","id_cg_mife"),
    id_gd_mife("Millennial Females","id_gd_mife"),
    id_gd_mima("Millennial Males","id_gd_mima"),
    id_cg_mima("Millennial Males","id_cg_mima"),
    id_cg_mill("Millennials","id_cg_mill"),
    id_ia_mogo("Movie Goers","id_ia_mogo"),
    id_en_movi("Movie Lovers","id_en_movi"),
    id_re_momu("Movie, Music and Games Buyers","id_re_momu"),
    id_ar_muth("Museum & Theatre Goers","id_ar_muth"),
    id_ar_muse("Museum Goers","id_ar_muse"),
    id_en_musi("Music Lovers","id_en_musi"),
    id_rl_musl("Muslims","id_rl_musl"),
    id_ia_news("News Readers","id_ia_news"),
    id_gd_olde("Older (50+)","id_gd_olde"),
    id_sp_outd("Outdoor Sports","id_sp_outd"),
    id_re_phpa("Pharmacy Patrons","id_re_phpa"),
    id_re_qsrc("QSR Customers","id_re_qsrc"),
    id_fd_qsrc("QSR Customers (Fast Food Patrons)","id_fd_qsrc"),
    id_tr_rail("Rail Travelers","id_tr_rail"),
    id_ia_read("Reading Enthusiasts","id_ia_read"),
    id_fd_rest("Restaurant Frequenters","id_fd_rest"),
    id_tr_road("Road Travelers","id_tr_road"),
    id_hf_rucy("Runners/Joggers","id_hf_rucy"),
    id_hf_runj("Runners/Joggers","id_hf_runj"),
    id_sp_runn("Running","id_sp_runn"),
    id_re_shoe("Shoe Shoppers","id_re_shoe"),
    id_pe_sing("Single & Dating","id_pe_sing"),
    id_cg_sing("Singles","id_cg_sing"),
    id_ls_sing("Singles","id_ls_sing"),
    id_bz_smal("Small Business Owners","id_bz_smal"),
    id_se_smal("Small Business Owners","id_se_smal"),
    id_sp_socc("Soccer Enthusiasts","id_sp_socc"),
    id_en_soci("Social & Casual Gamers","id_en_soci"),
    id_re_spor("Sports & Outdoors Buyers","id_re_spor"),
    id_sp_spor("Sports Enthusiasts","id_sp_spor"),
    id_te_swit("Switchers","id_te_swit"),
    id_ia_tvwa("TV  Watchers","id_ia_tvwa"),
    id_ia_teen("Tech Enthusiasts","id_ia_teen"),
    id_se_teip("Technology Industry Professionals","id_se_teip"),
    id_bz_teip("Technology Industry Professionals","id_bz_teip"),
    id_cg_tefe("Teenage Females","id_cg_tefe"),
    id_cg_tema("Teenage Males","id_cg_tema"),
    id_ar_thea("Theatre Lovers","id_ar_thea"),
    id_re_tick("Ticket Shoppers","id_re_tick"),
    id_re_toys("Toys, Kids & Baby Buyers","id_re_toys"),
    id_re_upsc("Upscale Shoppers","id_re_upsc"),
    id_te_vide("Video Lovers","id_te_vide"),
    id_en_vide("Video Watchers","id_en_vide"),
    id_re_yohi("Young & Hip Shoppers","id_re_yohi"),
    id_cg_youm("Young Mothers","id_cg_youm"),
    id_gd_youm("Young Mothers","id_gd_youm"),
    id_ar_phot("photo and video enthusiasts","id_ar_phot"),
    my_gd_1318("13-18","my_gd_1318"),
    my_gd_1924("19-24","my_gd_1924"),
    my_gd_2534("25-34","my_gd_2534"),
    my_gd_3549("35-49","my_gd_3549"),
    my_te_3gde("3G Device Consumers","my_te_3gde"),
    my_te_4gde("4G Device Consumers","my_te_4gde"),
    my_re_asea("ASEAN Tourist Shoppers","my_re_asea"),
    my_tr_airt("Air Travelers","my_tr_airt"),
    my_pe_alte("Alternative Lifestyle","my_pe_alte"),
    my_au_aubu("Auto Buying Intenders","my_au_aubu"),
    my_gd_avin("Average Income","my_gd_avin"),
    my_re_barg("Bargain Shoppers","my_re_barg"),
    my_re_beau("Beauty, Health & Grocery Buyers","my_re_beau"),
    my_re_bibo("Big Box Retailer Shoppers","my_re_bibo"),
    my_re_book("Books & Audible Buyers","my_re_book"),
    my_tr_bume("Bus/Metro Users","my_tr_bume"),
    my_tr_busi("Business Travelers","my_tr_busi"),
    my_re_cpgb("CPG Buyers","my_re_cpgb"),
    my_ia_casi("Casino Frequenters","my_ia_casi"),
    my_rl_chri("Christian","my_rl_chri"),
    my_re_chri("Christmas shoppers","my_re_chri"),
    my_re_clsj("Clothing, Shoes & Jewelery Buyers","my_re_clsj"),
    my_ed_coll("College Students","my_ed_coll"),
    my_ls_coll("College Students","my_ls_coll"),
    my_se_comp("Computer Industry Professionals","my_se_comp"),
    my_re_cons("Consumer Electronics Buyers","my_re_cons"),
    my_ia_ccme("Country Club Members","my_ia_ccme"),
    my_sp_cric("Cricket Fans","my_sp_cric"),
    my_sp_cycl("Cycling","my_sp_cycl"),
    my_ia_danc("Dance Lovers","my_ia_danc"),
    my_re_deep("Deepavali shoppers","my_re_deep"),
    my_re_dsvs("Department Store Value Shoppers","my_re_dsvs"),
    my_hf_diet("Dieters","my_hf_diet"),
    my_te_down("Downloaders","my_te_down"),
    my_te_dual("Dual Sim Phone Users","my_te_dual"),
    my_hf_exer("Exercise Enthusiasts","my_hf_exer"),
    my_cg_fawk("Families with Kids","my_cg_fawk"),
    my_gd_fawk("Families with Kids","my_gd_fawk"),
    my_re_fasf("Fashion Followers","my_re_fasf"),
    my_gd_fema("Females","my_gd_fema"),
    my_se_fina("Finance Industry Professionals","my_se_fina"),
    my_hf_fooc("Foodies/Cooking Enthusiasts","my_hf_fooc"),
    my_fd_fooc("Foodies/Cooking Enthusiasts","my_fd_fooc"),
    my_ia_game("Gamers","my_ia_game"),
    my_en_gaad("Games - Adventure","my_en_gaad"),
    my_en_gaar("Games - Arcade","my_en_gaar"),
    my_en_gabo("Games - Board","my_en_gabo"),
    my_en_gacr("Games - Card","my_en_gacr"),
    my_en_gacs("Games - Casino","my_en_gacs"),
    my_en_gaca("Games - Casual","my_en_gaca"),
    my_en_gadi("Games - Dice","my_en_gadi"),
    my_en_gafa("Games - Family","my_en_gafa"),
    my_en_gamr("Games - Music & Rhythm","my_en_gamr"),
    my_en_gapu("Games - Puzzle","my_en_gapu"),
    my_en_garv("Games - Racing & Vehicle Simulators","my_en_garv"),
    my_en_gasf("Games - Shooters and fps","my_en_gasf"),
    my_en_gasi("Games - Simulation","my_en_gasi"),
    my_en_gasp("Games - Sports","my_en_gasp"),
    my_en_gast("Games - Strategy","my_en_gast"),
    my_en_gatr("Games - Trivia","my_en_gatr"),
    my_en_gawo("Games - Word","my_en_gawo"),
    my_sp_golf("Golf Fans","my_sp_golf"),
    my_hf_gymr("Gym Regulars","my_hf_gymr"),
    my_gd_hiin("High Income","my_gd_hiin"),
    my_ed_hiss("High School Students","my_ed_hiss"),
    my_te_hida("High data Users","my_te_hida"),
    my_rl_hind("Hindu","my_rl_hind"),
    my_re_holi("Holiday Shoppers","my_re_holi"),
    my_fd_chef("Home Chefs","my_fd_chef"),
    my_re_home("Home, Garden & Tools Buyers","my_re_home"),
    my_re_hots("Hotel Shoppers","my_re_hots"),
    my_re_inte("In market: Telco","my_re_inte"),
    my_re_jewe("Jewelry Shoppers","my_re_jewe"),
    my_ls_jose("Job Seekers","my_ls_jose"),
    my_tr_leis("Leisure Travellers","my_tr_leis"),
    my_gd_lowi("Low Income","my_gd_lowi"),
    my_el_mawo("Malay Women","my_el_mawo"),
    my_gd_male("Males","my_gd_male"),
    my_gd_mife("Millennial Females","my_gd_mife"),
    my_cg_mife("Millennial Females","my_cg_mife"),
    my_cg_mima("Millennial Males","my_cg_mima"),
    my_gd_mima("Millennial Males","my_gd_mima"),
    my_cg_mill("Millennials","my_cg_mill"),
    my_ia_mogo("Movie Goers","my_ia_mogo"),
    my_en_movi("Movie Lovers","my_en_movi"),
    my_re_momu("Movie, Music and Games Buyers","my_re_momu"),
    my_ar_muth("Museum & Theatre Goers","my_ar_muth"),
    my_ar_muse("Museum Goers","my_ar_muse"),
    my_en_musi("Music Lovers","my_en_musi"),
    my_rl_musl("Muslims","my_rl_musl"),
    my_ia_news("News Readers","my_ia_news"),
    my_gd_olde("Older (50+)","my_gd_olde"),
    my_sp_outd("Outdoor Sports","my_sp_outd"),
    my_re_phpa("Pharmacy Patrons","my_re_phpa"),
    my_re_qsrc("QSR Customers","my_re_qsrc"),
    my_fd_qsrc("QSR Customers (Fast Food Patrons)","my_fd_qsrc"),
    my_tr_rail("Rail Travelers","my_tr_rail"),
    my_ia_read("Reading Enthusiasts","my_ia_read"),
    my_fd_rest("Restaurant Frequenters","my_fd_rest"),
    my_tr_road("Road Travelers","my_tr_road"),
    my_hf_runj("Runners/Joggers","my_hf_runj"),
    my_hf_rucy("Runners/Joggers","my_hf_rucy"),
    my_sp_runn("Running","my_sp_runn"),
    my_re_shoe("Shoe Shoppers","my_re_shoe"),
    my_pe_sing("Single & Dating","my_pe_sing"),
    my_cg_sing("Singles","my_cg_sing"),
    my_ls_sing("Singles","my_ls_sing"),
    my_bz_smal("Small Business Owners","my_bz_smal"),
    my_se_smal("Small Business Owners","my_se_smal"),
    my_sp_socc("Soccer Enthusiasts","my_sp_socc"),
    my_en_soci("Social & Casual Gamers","my_en_soci"),
    my_re_spor("Sports & Outdoors Buyers","my_re_spor"),
    my_sp_spor("Sports Enthusiasts","my_sp_spor"),
    my_te_swit("Switchers","my_te_swit"),
    my_ia_tvwa("TV  Watchers","my_ia_tvwa"),
    my_ia_teen("Tech Enthusiasts","my_ia_teen"),
    my_bz_teip("Technology Industry Professionals","my_bz_teip"),
    my_se_teip("Technology Industry Professionals","my_se_teip"),
    my_cg_tefe("Teenage Females","my_cg_tefe"),
    my_cg_tema("Teenage Males","my_cg_tema"),
    my_ar_thea("Theatre Lovers","my_ar_thea"),
    my_re_tick("Ticket Shoppers","my_re_tick"),
    my_re_toys("Toys, Kids & Baby Buyers","my_re_toys"),
    my_re_upsc("Upscale Shoppers","my_re_upsc"),
    my_te_vide("Video Lovers","my_te_vide"),
    my_en_vide("Video Watchers","my_en_vide"),
    my_re_yohi("Young & Hip Shoppers","my_re_yohi"),
    my_cg_youm("Young Mothers","my_cg_youm"),
    my_gd_youm("Young Mothers","my_gd_youm"),
    my_ar_phot("photo and video enthusiasts","my_ar_phot"),
    sg_gd_1318("13-18","sg_gd_1318"),
    sg_gd_1924("19-24","sg_gd_1924"),
    sg_gd_2534("25-34","sg_gd_2534"),
    sg_gd_3549("35-49","sg_gd_3549"),
    sg_te_3gde("3G Device Consumers","sg_te_3gde"),
    sg_te_4gde("4G Device Consumers","sg_te_4gde"),
    sg_re_asea("ASEAN Tourist shoppers","sg_re_asea"),
    sg_tr_airt("Air Travelers","sg_tr_airt"),
    sg_pe_alte("Alternative Lifestyle","sg_pe_alte"),
    sg_au_aubu("Auto Buying Intenders","sg_au_aubu"),
    sg_gd_avin("Average Income","sg_gd_avin"),
    sg_re_barg("Bargain Shoppers","sg_re_barg"),
    sg_re_beau("Beauty, Health & Grocery Buyers","sg_re_beau"),
    sg_re_bibo("Big Box Retailer Shoppers","sg_re_bibo"),
    sg_re_book("Books & Audible Buyers","sg_re_book"),
    sg_tr_bume("Bus/Metro Users","sg_tr_bume"),
    sg_tr_busi("Business Travelers","sg_tr_busi"),
    sg_re_cpgb("CPG Buyers","sg_re_cpgb"),
    sg_au_chin("Caltex High Income Group","sg_au_chin"),
    sg_rl_chri("Christian","sg_rl_chri"),
    sg_re_chri("Christmas shoppers","sg_re_chri"),
    sg_re_clsj("Clothing, Shoes & Jewelery Buyers","sg_re_clsj"),
    sg_ls_coll("College Students","sg_ls_coll"),
    sg_ed_coll("College Students","sg_ed_coll"),
    sg_se_comp("Computer Industry Professionals","sg_se_comp"),
    sg_re_cons("Consumer Electronics Buyers","sg_re_cons"),
    sg_ia_ccme("Country Club Members","sg_ia_ccme"),
    sg_sp_cric("Cricket Fans","sg_sp_cric"),
    sg_rt_cross("Cross Device Test - Singapore","sg_rt_cross"),
    sg_sp_cycl("Cycling","sg_sp_cycl"),
    sg_ia_danc("Dance Lovers","sg_ia_danc"),
    sg_re_deep("Deepavali shoppers","sg_re_deep"),
    sg_re_dsvs("Department Store Value Shoppers","sg_re_dsvs"),
    sg_hf_diet("Dieters","sg_hf_diet"),
    sg_te_down("Downloaders","sg_te_down"),
    sg_te_dual("Dual Sim Phone Users","sg_te_dual"),
    sg_hf_exer("Exercise Enthusiasts","sg_hf_exer"),
    sg_gd_fawk("Families with Kids","sg_gd_fawk"),
    sg_cg_fawk("Families with Kids","sg_cg_fawk"),
    sg_re_fasf("Fashion Followers","sg_re_fasf"),
    sg_gd_fema("Females","sg_gd_fema"),
    sg_se_fina("Finance Industry Professionals","sg_se_fina"),
    sg_hf_fooc("Foodies/Cooking Enthusiasts","sg_hf_fooc"),
    sg_fd_fooc("Foodies/Cooking Enthusiasts","sg_fd_fooc"),
    sg_ia_game("Gamers","sg_ia_game"),
    sg_en_gaad("Games - Adventure","sg_en_gaad"),
    sg_en_gaar("Games - Arcade","sg_en_gaar"),
    sg_en_gabo("Games - Board","sg_en_gabo"),
    sg_en_gacr("Games - Card","sg_en_gacr"),
    sg_en_gacs("Games - Casino","sg_en_gacs"),
    sg_en_gaca("Games - Casual","sg_en_gaca"),
    sg_en_gadi("Games - Dice","sg_en_gadi"),
    sg_en_gafa("Games - Family","sg_en_gafa"),
    sg_en_gamr("Games - Music & Rhythm","sg_en_gamr"),
    sg_en_gapu("Games - Puzzle","sg_en_gapu"),
    sg_en_garv("Games - Racing & Vehicle Simulators","sg_en_garv"),
    sg_en_gasf("Games - Shooters and fps","sg_en_gasf"),
    sg_en_gasi("Games - Simulation","sg_en_gasi"),
    sg_en_gasp("Games - Sports","sg_en_gasp"),
    sg_en_gast("Games - Strategy","sg_en_gast"),
    sg_en_gatr("Games - Trivia","sg_en_gatr"),
    sg_en_gawo("Games - Word","sg_en_gawo"),
    sg_sp_golf("Golf Fans","sg_sp_golf"),
    sg_hf_gymr("Gym Regulars","sg_hf_gymr"),
    sg_gd_hiin("High Income","sg_gd_hiin"),
    sg_ed_hiss("High School Students","sg_ed_hiss"),
    sg_te_hida("High data Users","sg_te_hida"),
    sg_rl_hind("Hindu","sg_rl_hind"),
    sg_re_holi("Holiday Shoppers","sg_re_holi"),
    sg_fd_chef("Home Chefs","sg_fd_chef"),
    sg_re_home("Home, Garden & Tools Buyers","sg_re_home"),
    sg_re_hots("Hotel Shoppers","sg_re_hots"),
    sg_re_inte("In market: Telco","sg_re_inte"),
    sg_re_jewe("Jewelry Shoppers","sg_re_jewe"),
    sg_ls_jose("Job Seekers","sg_ls_jose"),
    sg_tr_leis("Leisure Travellers","sg_tr_leis"),
    sg_gd_lowi("Low Income","sg_gd_lowi"),
    sg_gd_male("Males","sg_gd_male"),
    sg_cg_mife("Millennial Females","sg_cg_mife"),
    sg_gd_mife("Millennial Females","sg_gd_mife"),
    sg_gd_mima("Millennial Males","sg_gd_mima"),
    sg_cg_mima("Millennial Males","sg_cg_mima"),
    sg_cg_mill("Millennials","sg_cg_mill"),
    sg_ia_mogo("Movie Goers","sg_ia_mogo"),
    sg_en_movi("Movie Lovers","sg_en_movi"),
    sg_re_momu("Movie, Music and Games Buyers","sg_re_momu"),
    sg_ar_muth("Museum & Theatre Goers","sg_ar_muth"),
    sg_ar_muse("Museum Goers","sg_ar_muse"),
    sg_en_musi("Music Lovers","sg_en_musi"),
    sg_rl_musl("Muslims","sg_rl_musl"),
    sg_ia_news("News Readers","sg_ia_news"),
    sg_gd_olde("Older (50+)","sg_gd_olde"),
    sg_sp_outd("Outdoor Sports","sg_sp_outd"),
    sg_re_phpa("Pharmacy Patrons","sg_re_phpa"),
    sg_re_prcn("Pre-CNY shoppers","sg_re_prcn"),
    sg_re_qsrc("QSR Customers","sg_re_qsrc"),
    sg_fd_qsrc("QSR Customers (Fast Food Patrons)","sg_fd_qsrc"),
    sg_tr_rail("Rail Travelers","sg_tr_rail"),
    sg_ia_read("Reading Enthusiasts","sg_ia_read"),
    sg_fd_rest("Restaurant Frequenters","sg_fd_rest"),
    sg_tr_road("Road Travelers","sg_tr_road"),
    sg_hf_runj("Runners/Joggers","sg_hf_runj"),
    sg_hf_rucy("Runners/Joggers","sg_hf_rucy"),
    sg_sp_runn("Running","sg_sp_runn"),
    sg_re_shoe("Shoe Shoppers","sg_re_shoe"),
    sg_pe_sing("Single & Dating","sg_pe_sing"),
    sg_ls_sing("Singles","sg_ls_sing"),
    sg_cg_sing("Singles","sg_cg_sing"),
    sg_se_smal("Small Business Owners","sg_se_smal"),
    sg_bz_smal("Small Business Owners","sg_bz_smal"),
    sg_sp_socc("Soccer Enthusiasts","sg_sp_socc"),
    sg_en_soci("Social & Casual Gamers","sg_en_soci"),
    sg_re_spor("Sports & Outdoors Buyers","sg_re_spor"),
    sg_sp_spor("Sports Enthusiasts","sg_sp_spor"),
    sg_tr_stay("Staycation enthusiast","sg_tr_stay"),
    sg_te_swit("Switchers","sg_te_swit"),
    sg_ia_tvwa("TV  Watchers","sg_ia_tvwa"),
    sg_ia_teen("Tech Enthusiasts","sg_ia_teen"),
    sg_bz_teip("Technology Industry Professionals","sg_bz_teip"),
    sg_se_teip("Technology Industry Professionals","sg_se_teip"),
    sg_cg_tefe("Teenage Females","sg_cg_tefe"),
    sg_cg_tema("Teenage Males","sg_cg_tema"),
    sg_ar_thea("Theatre Lovers","sg_ar_thea"),
    sg_re_tick("Ticket Shoppers","sg_re_tick"),
    sg_re_toys("Toys, Kids & Baby Buyers","sg_re_toys"),
    sg_re_upsc("Upscale Shoppers","sg_re_upsc"),
    sg_te_vide("Video Lovers","sg_te_vide"),
    sg_en_vide("Video Watchers","sg_en_vide"),
    sg_re_vipc("Visa Paywave Consumers in SG","sg_re_vipc"),
    sg_re_yohi("Young & Hip Shoppers","sg_re_yohi"),
    sg_cg_youm("Young Mothers","sg_cg_youm"),
    sg_gd_youm("Young Mothers","sg_gd_youm"),
    sg_ar_phot("photo and video enthusiasts","sg_ar_phot");

    private static Map<String, MobilewallaSegmentMapper> map = new HashMap<String, MobilewallaSegmentMapper>();

    static {
        for (MobilewallaSegmentMapper val : MobilewallaSegmentMapper.values()) {
            map.put(val.segmentName, val);
        }
    }

    private static Map<String, MobilewallaSegmentMapper> map2 = new HashMap<String, MobilewallaSegmentMapper>();

    static {
        for (MobilewallaSegmentMapper val : MobilewallaSegmentMapper.values()) {
            map2.put(val.segmentId, val);
        }
    }

    private String segmentName;
    private String segmentId;

    private MobilewallaSegmentMapper(String sementName, String segmentId) {
        this.segmentName = sementName;
        this.segmentId = segmentId;
    }

    public static MobilewallaSegmentMapper getSegmentIdForSegmentName(String segmentName) {
        return map.get(segmentName);
    }

    public static MobilewallaSegmentMapper getSegmentNameForSegmentID(String segmentID) {
        return map2.get(segmentID);
    }

    public String getsegmentId() {
        return this.segmentId;
    }

    public String getsegmentName() {
        return this.segmentName;
    }
}