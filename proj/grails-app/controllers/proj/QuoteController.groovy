package proj

class QuoteController
{
  static defaultAction = 'random'

    def random()
    {
      def staticAuthor = 'Math'
      def staticContent = 'yes.'

      [author: staticAuthor, content: staticContent]
    }
}
