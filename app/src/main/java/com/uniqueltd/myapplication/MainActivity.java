package com.uniqueltd.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Image resources
        int[] imageResources = {
                R.drawable.z01 , R.drawable.z02 , R.drawable.z03 , R.drawable.z04 , R.drawable.z05 , R.drawable.z07 , R.drawable.z08 , R.drawable.z10 , R.drawable.z11 , R.drawable.z12 , R.drawable.z13 , R.drawable.z14 , R.drawable.z15 , R.drawable.z16 , R.drawable.z17 , R.drawable.z18 , R.drawable.z19 , R.drawable.z20 , R.drawable.z21 , R.drawable.z22 ,
                R.drawable.z24 , R.drawable.z25 , R.drawable.z26 , R.drawable.z27 , R.drawable.z28 , R.drawable.z30 , R.drawable.z31 , R.drawable.z32 , R.drawable.z33 , R.drawable.z34 , R.drawable.z35 , R.drawable.z36 , R.drawable.z37 , R.drawable.z38 , R.drawable.z39 , R.drawable.z40 , R.drawable.z41 , R.drawable.z42 , R.drawable.z43 , R.drawable.z44 ,
                R.drawable.z45 , R.drawable.z46 , R.drawable.z48 , R.drawable.z49 , R.drawable.z50 , R.drawable.z51 , R.drawable.z52 , R.drawable.z53 , R.drawable.z55 , R.drawable.z56 , R.drawable.z57 , R.drawable.z58 , R.drawable.z59 , R.drawable.z60 , R.drawable.z61 , R.drawable.z62 , R.drawable.z63 , R.drawable.z64 , R.drawable.z65 , R.drawable.z66 ,
                R.drawable.z68 , R.drawable.z69 , R.drawable.z70 , R.drawable.z71 , R.drawable.z72 , R.drawable.z73 , R.drawable.z74 , R.drawable.z75 , R.drawable.z76 , R.drawable.z77 , R.drawable.z78 , R.drawable.z80 , R.drawable.z81 , R.drawable.z82 , R.drawable.z83 , R.drawable.z84 , R.drawable.z85 , R.drawable.z86 , R.drawable.z87 , R.drawable.z88 ,
                R.drawable.z89 , R.drawable.z90 , R.drawable.z91 , R.drawable.z93 , R.drawable.z94 , R.drawable.z96 , R.drawable.z97 , R.drawable.z98 , R.drawable.z99 , R.drawable.z100, R.drawable.z101, R.drawable.z102, R.drawable.z103, R.drawable.z104, R.drawable.z105, R.drawable.z107, R.drawable.z108, R.drawable.z109, R.drawable.z110, R.drawable.z111,
                R.drawable.z112, R.drawable.z113, R.drawable.z114, R.drawable.z115, R.drawable.z116, R.drawable.z117, R.drawable.z119, R.drawable.z120, R.drawable.z121, R.drawable.z122, R.drawable.z123, R.drawable.z124, R.drawable.z126, R.drawable.z127, R.drawable.z129, R.drawable.z130, R.drawable.z132, R.drawable.z133, R.drawable.z134, R.drawable.z135,
                R.drawable.z136, R.drawable.z137, R.drawable.z138, R.drawable.z140, R.drawable.z141, R.drawable.z142, R.drawable.z143, R.drawable.z144, R.drawable.z145, R.drawable.z146, R.drawable.z147, R.drawable.z149, R.drawable.z150, R.drawable.z151, R.drawable.z152, R.drawable.z153, R.drawable.z155, R.drawable.z157, R.drawable.z158, R.drawable.z159,
                R.drawable.z160, R.drawable.z161, R.drawable.z162, R.drawable.z163, R.drawable.z164, R.drawable.z165, R.drawable.z166, R.drawable.z167, R.drawable.z168, R.drawable.z169, R.drawable.z171, R.drawable.z173, R.drawable.z174, R.drawable.z175, R.drawable.z176, R.drawable.z177, R.drawable.z178, R.drawable.z179, R.drawable.z181, R.drawable.z182,
                R.drawable.z183, R.drawable.z184, R.drawable.z187, R.drawable.z188, R.drawable.z189, R.drawable.z190, R.drawable.z191, R.drawable.z192, R.drawable.z193, R.drawable.z195, R.drawable.z196, R.drawable.z197, R.drawable.z198, R.drawable.z199, R.drawable.z200, R.drawable.z201, R.drawable.z202, R.drawable.z205, R.drawable.z206, R.drawable.z207,
                R.drawable.z208, R.drawable.z209, R.drawable.z210, R.drawable.z211, R.drawable.z212,
                R.drawable.a001, R.drawable.a002, R.drawable.a003, R.drawable.a004, R.drawable.a005, R.drawable.a006, R.drawable.a007, R.drawable.a008, R.drawable.a009, R.drawable.a010, R.drawable.a011, R.drawable.a012, R.drawable.a013, R.drawable.a014, R.drawable.a015, R.drawable.a016, R.drawable.a017, R.drawable.a018, R.drawable.a019, R.drawable.a020,
                R.drawable.a021, R.drawable.a022, R.drawable.a023, R.drawable.a024, R.drawable.a025, R.drawable.a026, R.drawable.a027, R.drawable.a028, R.drawable.a030, R.drawable.a031, R.drawable.a032, R.drawable.a033, R.drawable.a034, R.drawable.a035, R.drawable.a036, R.drawable.a037, R.drawable.a038, R.drawable.a039, R.drawable.a040,
                R.drawable.a041, R.drawable.a042, R.drawable.a043, R.drawable.a044, R.drawable.a045, R.drawable.a046, R.drawable.a047, R.drawable.a048, R.drawable.a049, R.drawable.a050, R.drawable.a051, R.drawable.a052, R.drawable.a053, R.drawable.a054, R.drawable.a055, R.drawable.a056, R.drawable.a057, R.drawable.a058, R.drawable.a059, R.drawable.a060,
                R.drawable.a061, R.drawable.a062, R.drawable.a063, R.drawable.a064, R.drawable.a065, R.drawable.a066, R.drawable.a067, R.drawable.a068, R.drawable.a069, R.drawable.a070, R.drawable.a071, R.drawable.a072, R.drawable.a073, R.drawable.a074, R.drawable.a075, R.drawable.a076, R.drawable.a081, R.drawable.a083, R.drawable.a085, R.drawable.a093,
                R.drawable.a094, R.drawable.a095, R.drawable.a098, R.drawable.a099, R.drawable.a100, R.drawable.a105, R.drawable.a106, R.drawable.a107, R.drawable.a108, R.drawable.a109, R.drawable.a110, R.drawable.a112, R.drawable.a113, R.drawable.a114, R.drawable.a115, R.drawable.a116, R.drawable.a117, R.drawable.a119, R.drawable.a120, R.drawable.a121,
                R.drawable.a122, R.drawable.a123, R.drawable.a124, R.drawable.a126, R.drawable.a127, R.drawable.a129, R.drawable.a130, R.drawable.a132, R.drawable.a133, R.drawable.a134, R.drawable.a135, R.drawable.a136, R.drawable.a137, R.drawable.a138, R.drawable.a140, R.drawable.a141, R.drawable.a142, R.drawable.a143, R.drawable.a144, R.drawable.a145,
                R.drawable.a146, R.drawable.a147, R.drawable.a149, R.drawable.a150, R.drawable.a151, R.drawable.a152, R.drawable.a153, R.drawable.a155, R.drawable.a157, R.drawable.a158, R.drawable.a159, R.drawable.a160, R.drawable.a161, R.drawable.a162, R.drawable.a163, R.drawable.a164, R.drawable.a165, R.drawable.a167, R.drawable.a168, R.drawable.a169,
                R.drawable.a171, R.drawable.a173, R.drawable.a174, R.drawable.a175, R.drawable.a176, R.drawable.a177, R.drawable.a178, R.drawable.a179, R.drawable.a180, R.drawable.a181, R.drawable.a182, R.drawable.a183, R.drawable.a184, R.drawable.a187, R.drawable.a188, R.drawable.a189, R.drawable.a190, R.drawable.a191, R.drawable.a192, R.drawable.a193,
                R.drawable.a195, R.drawable.a196, R.drawable.a197, R.drawable.a199, R.drawable.a200, R.drawable.a201, R.drawable.a202, R.drawable.a205, R.drawable.a206, R.drawable.a207, R.drawable.a208, R.drawable.a209, R.drawable.a210, R.drawable.a211, R.drawable.a212, R.drawable.a213, R.drawable.a214, R.drawable.a216, R.drawable.a217, R.drawable.a218,
                R.drawable.a219, R.drawable.a220, R.drawable.a222, R.drawable.a223, R.drawable.a224, R.drawable.a225, R.drawable.a227, R.drawable.a228, R.drawable.a229, R.drawable.a230, R.drawable.a231, R.drawable.a232, R.drawable.a233, R.drawable.a234, R.drawable.a235, R.drawable.a236, R.drawable.a237, R.drawable.a238, R.drawable.a239, R.drawable.a240,
                R.drawable.a241, R.drawable.a242, R.drawable.a243, R.drawable.a244, R.drawable.a245, R.drawable.a246, R.drawable.a247, R.drawable.a248, R.drawable.a249, R.drawable.a250, R.drawable.a251, R.drawable.a252, R.drawable.a253, R.drawable.a254, R.drawable.a255, R.drawable.a256, R.drawable.a257, R.drawable.a258, R.drawable.a259, R.drawable.a262,
                R.drawable.a263, R.drawable.a264, R.drawable.a265, R.drawable.a266, R.drawable.a267, R.drawable.a268, R.drawable.a269, R.drawable.a270, R.drawable.a271, R.drawable.a272, R.drawable.a273, R.drawable.a274, R.drawable.a275, R.drawable.a276, R.drawable.a277, R.drawable.a278, R.drawable.a279, R.drawable.a280, R.drawable.a281, R.drawable.a282,
                R.drawable.a283, R.drawable.a284, R.drawable.a285, R.drawable.a286, R.drawable.a288, R.drawable.a289, R.drawable.a290, R.drawable.a291, R.drawable.a292, R.drawable.a293, R.drawable.a295, R.drawable.a296, R.drawable.a297, R.drawable.a298, R.drawable.a299, R.drawable.a300, R.drawable.a301, R.drawable.a302, R.drawable.a303, R.drawable.a304,
                R.drawable.a305, R.drawable.a306, R.drawable.a307, R.drawable.a308, R.drawable.a309, R.drawable.a310, R.drawable.a311, R.drawable.a313, R.drawable.a314, R.drawable.a315, R.drawable.a316, R.drawable.a317, R.drawable.a318, R.drawable.a319, R.drawable.a321, R.drawable.a323, R.drawable.a324, R.drawable.a325, R.drawable.a326, R.drawable.a327,
                R.drawable.a328, R.drawable.a329, R.drawable.a330, R.drawable.a331, R.drawable.a332, R.drawable.a333, R.drawable.a334, R.drawable.a335, R.drawable.a336, R.drawable.a337, R.drawable.a338, R.drawable.a339, R.drawable.a340, R.drawable.a341, R.drawable.a342, R.drawable.a343, R.drawable.a344, R.drawable.a345, R.drawable.a346, R.drawable.a347,
                R.drawable.a348, R.drawable.a349, R.drawable.a350, R.drawable.a351, R.drawable.a352, R.drawable.a353, R.drawable.a354, R.drawable.a355, R.drawable.a356, R.drawable.a357, R.drawable.a358, R.drawable.a359, R.drawable.a360, R.drawable.a361, R.drawable.a362, R.drawable.a363, R.drawable.a364, R.drawable.a366, R.drawable.a367, R.drawable.a368,
                R.drawable.a369, R.drawable.a370, R.drawable.a371, R.drawable.a372, R.drawable.a373, R.drawable.a374, R.drawable.a375, R.drawable.a376, R.drawable.a377, R.drawable.a378, R.drawable.a379, R.drawable.a380, R.drawable.a381, R.drawable.a382, R.drawable.a383, R.drawable.a384, R.drawable.a385, R.drawable.a386, R.drawable.a387, R.drawable.a388,
                R.drawable.a389, R.drawable.a390, R.drawable.a391, R.drawable.a392, R.drawable.a393
         };
        // Image tags
        String[] imageTags = {
                "z01", "z02", "z03", "z04", "z05","z07","z08","z10","z11","z12","z13","z14","z15","z16","z17","z18","z19","z20","z21","z22","z24","z25","z26","z27","z28","z30",
                "z31","z32","z33","z34","z35","z36","z37","z38","z39","z40", "z41","z42","z43","z44","z45","z46","z47","z48","z49","z50","z51","z52","z53","z55","z56","z57",
                "z58","z59","z60","z61","z62","z63","z64","z65","z66","z68","z69","z70","z71","z72","z73", "z74","z75","z76","z77","z78","z80","z81","z82","z83","z84","z85",
                "z86","z87","z88","z89","z90","z91","z93","z94","z96","z97","z98","z99","z100","z101","z102","z103","z104","z105","z107","z108","z109","z110","z111","z112",
                "z113","z114","z115","z116","z117","z118","z119","z120","z121","z122","z123","z124","z126","z127","z129","z130","z132","z133","z134","z135","z136","z137","z138",
                "z140","z141","z142","z143","z144","z145","z146","z147","z149","z150", "z151","z152","z153","z155","z157","z158","z159","z160","z161","z162","z163","z164","z165",
                "z166","z167","z168","z169","z171","z173","z174","z175","z176","z177","z178","z179","z181","z182","z183","z184","z187","z188","z189","z190","z191","z192","z193","z195",
                "z196","z197","z198","z199","z200","z201","z202","z205","z206","z207","z208","z209","z210","z211", "z212",
                "a001", "a002", "a003", "a004", "a005", "a006", "a007", "a008", "a009", "a010", "a011", "a012", "a013", "a014", "a015", "a016", "a017", "a018", "a019", "a020",
                "a021", "a022", "a023", "a024", "a025", "a026", "a027", "a028", "a030", "a031", "a032", "a033", "a034", "a035", "a036", "a037", "a038", "a039", "a040",
                "a041", "a042", "a043", "a044", "a045", "a046", "a047", "a048", "a049", "a050", "a051", "a052", "a053", "a054", "a055", "a056", "a057", "a058", "a059", "a060",
                "a061", "a062", "a063", "a064", "a065", "a066", "a067", "a068", "a069", "a070", "a071", "a072", "a073", "a074", "a075", "a076", "a081", "a083", "a085", "a093",
                "a094", "a095", "a098", "a099", "a100", "a105", "a106", "a107", "a108", "a109", "a110", "a112", "a113", "a114", "a115", "a116", "a117", "a119", "a120", "a121",
                "a122", "a123", "a124", "a126", "a127", "a129", "a130", "a132", "a133", "a134", "a135", "a136", "a137", "a138", "a140", "a141", "a142", "a143", "a144", "a145",
                "a146", "a147", "a149", "a150", "a151", "a152", "a153", "a155", "a157", "a158", "a159", "a160", "a161", "a162", "a163", "a164", "a165", "a167", "a168", "a169",
                "a171", "a173", "a174", "a175", "a176", "a177", "a178", "a179", "a180", "a181", "a182", "a183", "a184", "a187", "a188", "a189", "a190", "a191", "a192", "a193",
                "a195", "a196", "a197", "a199", "a200", "a201", "a202", "a205", "a206", "a207", "a208", "a209", "a210", "a211", "a212", "a213", "a214", "a216", "a217", "a218",
                "a219", "a220", "a222", "a223", "a224", "a225", "a227", "a228", "a229", "a230", "a231", "a232", "a233", "a234", "a235", "a236", "a237", "a238", "a239", "a240",
                "a241", "a242", "a243", "a244", "a245", "a246", "a247", "a248", "a249", "a250", "a251", "a252", "a253", "a254", "a255", "a256", "a257", "a258", "a259", "a262",
                "a263", "a264", "a265", "a266", "a267", "a268", "a269", "a270", "a271", "a272", "a273", "a274", "a275", "a276", "a277", "a278", "a279", "a280", "a281", "a282",
                "a283", "a284", "a285", "a286", "a288", "a289", "a290", "a291", "a292", "a293", "a295", "a296", "a297", "a298", "a299", "a300", "a301", "a302", "a303", "a304",
                "a305", "a306", "a307", "a308", "a309", "a310", "a311", "a313", "a314", "a315", "a316", "a317", "a318", "a319", "a321", "a323", "a324", "a325", "a326", "a327",
                "a328", "a329", "a330", "a331", "a332", "a333", "a334", "a335", "a336", "a337", "a338", "a339", "a340", "a341", "a342", "a343", "a344", "a345", "a346", "a347",
                "a348", "a349", "a350", "a351", "a352", "a353", "a354", "a355", "a356", "a357", "a358", "a359", "a360", "a361", "a362", "a363", "a364", "a366", "a367", "a368",
                "a369", "a370", "a371", "a372", "a373", "a374", "a375", "a376", "a377", "a378", "a379", "a380", "a381", "a382", "a383", "a384", "a385", "a386", "a387", "a388",
                "a389", "a390", "a391", "a392", "a393"
        };

        // RecyclerView setup
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ImageAdapter adapter = new ImageAdapter(this, imageResources, imageTags);
        recyclerView.setAdapter(adapter);

        // Floating Action Button setup
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> openLink());

    }

    private void openLink() {
        String url = "https://wa.me/+923408858676"; // Replace with your desired link
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


}
