package com.ak.ta.dainikbhaskar.activit.modas;

import static com.ak.ta.dainikbhaskar.activit.frg.StAs.dddd;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ak.ta.dainikbhaskar.activit.R;
import com.ak.ta.dainikbhaskar.activit.ac.GmAS;

import java.util.Random;

public class MgTt {

    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;
    ImageView imageView13;
    ImageView imageView14;
    ImageView imageView15;
    ImageView imageView16;
    ImageView imageView18;
    ImageView imageView19;
    ImageView imageView20;
    ImageView imageView21;
    ImageView imageView22;

    ImageView imageView1;
    ImageView imageView2;
    int tag1;
    int tag2;
    public static GmAS gmAS;
    int aa = 0;
    TextView textView;
    TextView textViewp1;
    TextView textViewp2;
    TextView textViewW1,textViewW2;
    boolean ttt = true;
    int i1 = 0;
    int i2 = 0;

    public void setImageView1(ImageView imageView1) {
        this.imageView1 = imageView1;
    }

    public void setTextViewW1(TextView textViewW1) {
        this.textViewW1 = textViewW1;
    }

    public void setTextViewW2(TextView textViewW2) {
        this.textViewW2 = textViewW2;
    }

    public void setTextViewp1(TextView textViewp1) {
        this.textViewp1 = textViewp1;
    }

    public void setTextViewp2(TextView textViewp2) {
        this.textViewp2 = textViewp2;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public void dsh(ImageView imageView, int tag) {
        this.imageView1 = imageView;
        tag1 = tag;
        if (tag == 0) {
            imageView1.setImageResource(R.drawable.ss2);
        } else if (tag == 1) {
            imageView1.setImageResource(R.drawable.ss4);
        } else if (tag == 2) {
            imageView1.setImageResource(R.drawable.ss5);
        } else if (tag == 3) {
            imageView1.setImageResource(R.drawable.ss6);
        } else if (tag == 4) {
            imageView1.setImageResource(R.drawable.ss7);
        } else if (tag == 5) {
            imageView1.setImageResource(R.drawable.ss8);
        }


    }

    public void fdh(ImageView imageView, int tag) {
        this.imageView2 = imageView;
        tag2 = tag;
        if (tag == 0) {
            imageView2.setImageResource(R.drawable.ss2);
        } else if (tag == 1) {
            imageView2.setImageResource(R.drawable.ss4);
        } else if (tag == 2) {
            imageView2.setImageResource(R.drawable.ss5);
        } else if (tag == 3) {
            imageView2.setImageResource(R.drawable.ss6);
        } else if (tag == 4) {
            imageView2.setImageResource(R.drawable.ss7);
        } else if (tag == 5) {
            imageView2.setImageResource(R.drawable.ss8);
        }

    }

    public void dfsa() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (tag1 == tag2) {
                    imageView1.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                    if (dddd) {
                        if (ttt) {
                            i1++;
                            textViewp1.setText("player 1 - " + i1);
                            ttt = false;
                        } else {
                            i2++;
                            textViewp2.setText("player 2 - " + i2);
                            ttt = true;
                        }
                    }

                    aa++;
                } else {
                    imageView1.setImageResource(R.drawable.ss1);
                    imageView2.setImageResource(R.drawable.ss1);
                }
                imageView10.setClickable(true);
                imageView11.setClickable(true);
                imageView12.setClickable(true);
                imageView13.setClickable(true);
                imageView14.setClickable(true);
                imageView15.setClickable(true);
                imageView16.setClickable(true);
                imageView18.setClickable(true);
                imageView19.setClickable(true);
                imageView20.setClickable(true);
                imageView21.setClickable(true);
                imageView22.setClickable(true);

                if (dddd) {
                    if (aa == 5) {
                        aa = 0;
                        if (i1>i2){
                            textViewW1.setVisibility(View.VISIBLE);
                        }else {
                            textViewW2.setVisibility(View.VISIBLE);
                        }
                        i1 = 0;
                        i2 = 0;

                    }
                } else {
                    if (aa == 6) {
                        aa = 0;
                        textView.setVisibility(View.VISIBLE);
                        GmAS.cc = 1;
                        gmAS.getSharedPreferences(gmAS.getPackageName(), gmAS.MODE_PRIVATE).edit().putInt("cc", GmAS.aa).apply();
                    }
                }
            }
        }, 1000);
    }

    public ImageView getImageView20() {
        return imageView20;
    }

    public void setImageView20(ImageView imageView20) {
        this.imageView20 = imageView20;
    }

    public ImageView getImageView21() {
        return imageView21;
    }

    public void setImageView21(ImageView imageView21) {
        this.imageView21 = imageView21;
    }

    public ImageView getImageView22() {
        return imageView22;
    }

    public void setImageView22(ImageView imageView22) {
        this.imageView22 = imageView22;
    }

    public ImageView getImageView10() {
        return imageView10;
    }

    public void setImageView10(ImageView imageView10) {
        this.imageView10 = imageView10;
    }

    public ImageView getImageView11() {
        return imageView11;
    }

    public void setImageView11(ImageView imageView11) {
        this.imageView11 = imageView11;
    }

    public ImageView getImageView12() {
        return imageView12;
    }

    public void setImageView12(ImageView imageView12) {
        this.imageView12 = imageView12;
    }

    public ImageView getImageView13() {
        return imageView13;
    }

    public void setImageView13(ImageView imageView13) {
        this.imageView13 = imageView13;
    }

    public ImageView getImageView14() {
        return imageView14;
    }

    public void setImageView14(ImageView imageView14) {
        this.imageView14 = imageView14;
    }

    public ImageView getImageView15() {
        return imageView15;
    }

    public void setImageView15(ImageView imageView15) {
        this.imageView15 = imageView15;
    }

    public ImageView getImageView16() {
        return imageView16;
    }

    public void setImageView16(ImageView imageView16) {
        this.imageView16 = imageView16;
    }

    public ImageView getImageView18() {
        return imageView18;
    }

    public void setImageView18(ImageView imageView18) {
        this.imageView18 = imageView18;
    }

    public ImageView getImageView19() {
        return imageView19;
    }

    public void setImageView19(ImageView imageView19) {
        this.imageView19 = imageView19;
    }


    public void jgj() {
        Random random = new Random();
        new Thread(new Runnable() {
            @Override
            public void run() {
                switch (random.nextInt(9)) {
                    case 0:

                        imageView10.setTag(0);
                        imageView11.setTag(0);
                        imageView12.setTag(1);
                        imageView13.setTag(1);
                        imageView14.setTag(2);
                        imageView15.setTag(2);
                        imageView16.setTag(3);
                        imageView18.setTag(3);
                        imageView19.setTag(4);
                        imageView20.setTag(4);
                        imageView21.setTag(5);
                        imageView22.setTag(5);
                        break;
                    case 1:
                        imageView10.setTag(1);
                        imageView11.setTag(1);
                        imageView12.setTag(2);
                        imageView13.setTag(2);
                        imageView14.setTag(3);
                        imageView15.setTag(3);
                        imageView16.setTag(4);
                        imageView18.setTag(4);
                        imageView19.setTag(5);
                        imageView20.setTag(5);
                        imageView21.setTag(0);
                        imageView22.setTag(0);
                        break;
                    case 2:
                        imageView10.setTag(0);
                        imageView11.setTag(0);
                        imageView12.setTag(5);
                        imageView13.setTag(5);
                        imageView14.setTag(4);
                        imageView15.setTag(4);
                        imageView16.setTag(3);
                        imageView18.setTag(3);
                        imageView19.setTag(2);
                        imageView20.setTag(2);
                        imageView21.setTag(1);
                        imageView22.setTag(1);
                        break;
                    case 3:
                        imageView10.setTag(1);
                        imageView11.setTag(0);
                        imageView12.setTag(2);
                        imageView13.setTag(0);
                        imageView14.setTag(3);
                        imageView15.setTag(4);
                        imageView16.setTag(5);
                        imageView18.setTag(1);
                        imageView19.setTag(5);
                        imageView20.setTag(4);
                        imageView21.setTag(2);
                        imageView22.setTag(3);
                        break;
                    case 4:
                        imageView10.setTag(3);
                        imageView11.setTag(1);
                        imageView12.setTag(4);
                        imageView13.setTag(1);
                        imageView14.setTag(2);
                        imageView15.setTag(4);
                        imageView16.setTag(2);
                        imageView18.setTag(5);
                        imageView19.setTag(0);
                        imageView20.setTag(3);
                        imageView21.setTag(0);
                        imageView22.setTag(5);
                        break;
                    case 5:
                        imageView10.setTag(1);
                        imageView11.setTag(0);
                        imageView12.setTag(2);
                        imageView13.setTag(3);
                        imageView14.setTag(4);
                        imageView15.setTag(5);
                        imageView16.setTag(5);
                        imageView18.setTag(4);
                        imageView19.setTag(3);
                        imageView20.setTag(2);
                        imageView21.setTag(0);
                        imageView22.setTag(1);
                        break;
                    case 6:
                        imageView10.setTag(5);
                        imageView11.setTag(4);
                        imageView12.setTag(3);
                        imageView13.setTag(2);
                        imageView14.setTag(1);
                        imageView15.setTag(0);
                        imageView16.setTag(0);
                        imageView18.setTag(1);
                        imageView19.setTag(2);
                        imageView20.setTag(3);
                        imageView21.setTag(4);
                        imageView22.setTag(5);
                        break;
                    case 7:
                        imageView10.setTag(4);
                        imageView11.setTag(3);
                        imageView12.setTag(2);
                        imageView13.setTag(1);
                        imageView14.setTag(5);
                        imageView15.setTag(0);
                        imageView16.setTag(0);
                        imageView18.setTag(5);
                        imageView19.setTag(1);
                        imageView20.setTag(2);
                        imageView21.setTag(3);
                        imageView22.setTag(4);
                        break;
                    case 8:
                        imageView10.setTag(3);
                        imageView11.setTag(2);
                        imageView12.setTag(1);
                        imageView13.setTag(0);
                        imageView14.setTag(4);
                        imageView15.setTag(5);
                        imageView16.setTag(5);
                        imageView18.setTag(4);
                        imageView19.setTag(0);
                        imageView20.setTag(1);
                        imageView21.setTag(2);
                        imageView22.setTag(3);
                        break;

                }
            }
        }).start();
    }
}
