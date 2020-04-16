using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TicTacToe
{
    public partial class Form1 : Form
    {
        private int buttonsClicked = 0;
        private bool gameOver = false;
        
        public Form1()
        {
            InitializeComponent();

            foreach (Control ctl in this.Controls)
            {
                //add event handlers to tic tac toe buttons
                if (ctl is Button && ctl.Name != "btnReset")
                    ctl.Click += button_Click;
            }

            DoReset();
        }

        private void button_Click(object sender, EventArgs e)
        {
            if (gameOver)
                return;

            ((Button)sender).Text = radXgoes.Checked ? "X" : "O";
            this.btnReset.Focus();
            ((Button)sender).Enabled = false;

            radXgoes.Checked = !radXgoes.Checked;
            radOgoes.Checked = !radXgoes.Checked;

            string winner = CheckForWinner();
            if (winner.Length > 0) 
            {
                this.lblMessage.Text = string.Format("We have a winner: {0}", winner);
                gameOver = true;
            }

            buttonsClicked++;
            if (buttonsClicked >= 9 && winner !="X" && winner !="O")
            {
                this.lblMessage.Text = "This game is a draw!";
                gameOver = true;
            }
           

        }

        private string CheckForWinner() 
        {
            string winner = string.Empty;

            int xWinCount = 0;
            int oWinCount = 0;


            if(((button11.Text) == (button12.Text)) )  //1
            {
                if (true)
                {
                    if ((button12.Text) == (button13.Text))
                     {

                        if (button11.Text == "X")
                        {
                            winner = "X";
                            xWinCount++;
                        }
                        else if(button11.Text=="O")
                        {

                            winner = "O";
                            oWinCount++;
                        }
                      

                    }
                }
            }

            if (((button21.Text) == (button22.Text))) //2
            {
                if (true)
                {
                    if ((button22.Text) == (button23.Text))
                    {

                        if (button21.Text == "X")
                        {
                            winner = "X";
                            xWinCount++;
                        }
                        else if (button21.Text == "O")
                        {

                            winner = "O";
                            oWinCount++;

                        }
                        

                    }
                }



            }

            if (((button31.Text) == (button32.Text))) //3
            {
                if (true)
                {
                    if ((button32.Text) == (button33.Text))
                    {

                        if (button31.Text == "X")
                        {
                           winner = "X";
                            xWinCount++;
                        }
                        else if (button31.Text == "O")
                        {

                            winner = "O";
                            oWinCount++;
                        }
                        

                    }
                }



            }


            if (((button11.Text) == (button21.Text))) //4
            {
                if (true)
                {
                    if ((button21.Text) == (button31.Text))
                    {

                        if (button11.Text == "X")
                        {
                            winner = "X";
                            xWinCount++;
                        }
                        else if (button11.Text == "O")
                        {

                           winner = "O";
                            oWinCount++;
                        }
                      

                    }
                }



            }


            if (((button12.Text) == (button22.Text))) //5
            {
                if (true)
                {
                    if ((button22.Text) == (button32.Text))
                    {

                        if (button12.Text == "X")
                        {
                             winner = "X";
                            xWinCount++;
                        }
                        else if (button12.Text == "O")
                        {

                             winner = "O";
                            oWinCount++;
                        }
                       

                    }
                }



            }


            if (((button13.Text) == (button23.Text))) //6
            {
                if (true)
                {
                    if ((button23.Text) == (button33.Text))
                    {

                        if (button13.Text == "X")
                        {
                           winner = "X";
                            xWinCount++;
                        }
                        else if (button13.Text == "O")
                        {

                            winner = "O";
                            oWinCount++;
                        }
                       
                    }
                }



            }

            if (((button11.Text) == (button22.Text))) //7
            {
                if (true)
                {
                    if ((button22.Text) == (button33.Text))
                    {

                        if (button11.Text == "X")
                        {
                            winner = "X";
                            xWinCount++;
                        }
                        else if (button11.Text == "O")
                        {

                            winner = "O";
                            oWinCount++;
                        }
                       

                    }
                }



            }


           

            if (((button13.Text) == (button22.Text))) //8
            {
                if (true)
                {
                    if ((button22.Text) == (button31.Text))
                    {

                        if (button13.Text == "X")
                        {
                            winner = "X";
                            xWinCount++;
                        }
                        else if (button13.Text == "O")
                        {

                            winner = "O";
                            xWinCount++;
                        }
                       

                    }
                }



            }



            //TO DO:
            //
            //Check for a winner!
            //
            //Return either "X", "O", or "".

            
            return winner;
        }

        private void btnReset_Click(object sender, EventArgs e)
        {
            DoReset();
        }

        private void DoReset() 
        {
            foreach (Control ctl in this.Controls)
            {
                if (ctl is Button && ctl.Name != "btnReset") 
                {
                    ((Button)ctl).Text = string.Empty;
                    ((Button)ctl).Enabled = true;
                }
            }

            radXgoes.Checked = true;
            buttonsClicked = 0;
            gameOver = false;
            this.lblMessage.Text = string.Empty;
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button11_Click(object sender, EventArgs e)
        {

        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void radXgoes_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void radOgoes_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void button12_Click(object sender, EventArgs e)
        {

        }

        private void button13_Click(object sender, EventArgs e)
        {

        }

        private void button23_Click(object sender, EventArgs e)
        {

        }

        private void button22_Click(object sender, EventArgs e)
        {

        }

        private void button21_Click(object sender, EventArgs e)
        {

        }

        private void button31_Click(object sender, EventArgs e)
        {

        }

        private void button32_Click(object sender, EventArgs e)
        {

        }

        private void button33_Click(object sender, EventArgs e)
        {

        }
    }
}
