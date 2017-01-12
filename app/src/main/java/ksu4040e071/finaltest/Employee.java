package ksu4040e071.finaltest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Employee extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(
                        2, StaggeredGridLayoutManager.VERTICAL));
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member(92, R.drawable.tourism01,"【苗栗/小屋(環境篇)"));
        memberList.add(new Member(103, R.drawable.tourism02, "紀州名湯細數日本文化點滴"));
        memberList.add(new Member(234, R.drawable.tourism03, "台南鐵牛車水町」"));
        memberList.add(new Member(35, R.drawable.tourism04, "十分車站~~鄉十分幸福的氣息"));
        memberList.add(new Member(23, R.drawable.tourism05, "發現宜蘭天堂玩法懶人包"));
        memberList.add(new Member(75, R.drawable.tourism06, "清水地熱~~體驗受暖暖的大自然氣息"));
        memberList.add(new Member(65, R.drawable.tourism07, "【基隆/中正洞巖"));
        memberList.add(new Member(12, R.drawable.tourism08, "2016士林官邸菊1/27-12/11"));
        memberList.add(new Member(45, R.drawable.tourism09, "繁花似錦！洋紫，秋末街景醉人心弦"));
        memberList.add(new Member(78, R.drawable.tourism10, "【明星旅遊趣】檔遊上被找當男公關？！"));
        memberList.add(new Member(57, R.drawable.tourism11, "[德國] Baste泰工的奇石"));
        memberList.add(new Member(61, R.drawable.tourism12, "台北101法國耶氣氛吧"));
        recyclerView.setAdapter(new MemberAdapter(this, memberList));
    }

    private class MemberAdapter extends
            RecyclerView.Adapter<MemberAdapter.ViewHolder> {
        private Context context;
        private LayoutInflater layoutInflater;
        private List<Member> memberList;

        public MemberAdapter(Context context, List<Member> memberList) {
            this.context = context;
            layoutInflater = LayoutInflater.from(context);
            this.memberList = memberList;
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView ivImage;
            TextView  tvName;
            View itemView;

            public ViewHolder(View itemView) {
                super(itemView);
                this.itemView = itemView;
                ivImage = (ImageView) itemView.findViewById(R.id.ivImage);
                tvName = (TextView) itemView.findViewById(R.id.tvName);
            }
        }

        @Override
        public int getItemCount() {
            return memberList.size();
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View itemView = layoutInflater.inflate(
                    R.layout.employee_item, viewGroup, false);
            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, final int position) {
            final Member member = memberList.get(position);
            viewHolder.ivImage.setImageResource(member.getImage());
            //viewHolder.tvId.setText(String.valueOf(member.getId()));
            viewHolder.tvName.setText(member.getName());
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(member.getImage());


                    Toast toast = new Toast(context);
                    toast.setView(imageView);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.show();
                }
            });
        }
    }
}
